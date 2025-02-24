// vite.config.ts
import { defineConfig } from 'vite'
import AutoImport from 'unplugin-auto-import/vite'
import Components from 'unplugin-vue-components/vite'
import { ElementPlusResolver } from 'unplugin-vue-components/resolvers'
import vue from '@vitejs/plugin-vue'
import path from 'path'
// 图片压缩
import viteImagemin from 'vite-plugin-imagemin'
// 查看打包体积
import { visualizer } from 'rollup-plugin-visualizer'
import externalGlobals from 'rollup-plugin-external-globals'

const globals = externalGlobals({
    vue: 'Vue',
    axios: 'axios',
    'element-plus': 'ElementPlus',
    lodash: '_',
    'vue-demi': 'VueDemi' // 添加 vue-demi 的全局变量映射
})

export default defineConfig({
    define: {
        'process.env': {
            BASE_API: 'http://localhost:5173' // 前端Base_URl
        }
    },
    server: {
        proxy: {
            '/app-api': {
                target: 'http://127.0.0.1:8081', // 后端Base_URl
                changeOrigin: true
            }
        },
        host: '0.0.0.0'
    },
    resolve: {
        // 配置路径别名
        alias: {
            '@': path.resolve(__dirname, './src')
        }
    },
    plugins: [
        vue(),
        visualizer({
            open: true,
            filename: 'package-view.html' //分析图生成的文件名
        }),
        // 图片资源压缩
        viteImagemin({
            gifsicle: {
                // gif图片压缩
                optimizationLevel: 3, // 选择1到3之间的优化级别
                interlaced: false // 隔行扫描gif进行渐进式渲染
            },
            optipng: {
                // png
                optimizationLevel: 7 // 选择0到7之间的优化级别
            },
            mozjpeg: {
                // jpeg
                quality: 20 // 压缩质量，范围从0(最差)到100(最佳)。
            },
            pngquant: {
                // png
                quality: [0.8, 0.9], // Min和max是介于0(最差)到1(最佳)之间的数字，类似于JPEG。达到或超过最高质量所需的最少量的颜色。如果转换导致质量低于最低质量，图像将不会被保存。
                speed: 4 // 压缩速度，1(强力)到11(最快)
            },
            svgo: {
                plugins: [
                    // svg压缩
                    {
                        name: 'removeViewBox'
                    },
                    {
                        name: 'removeEmptyAttrs',
                        active: false
                    }
                ]
            }
        }),
        //自动引入Element-ui的相关组件
        AutoImport({
            imports: ['vue'],
            dts: 'src/auto-import.d.ts',
            resolvers: [ElementPlusResolver()]
        }),
        Components({
            resolvers: [ElementPlusResolver()]
        })
    ],
    build: {
        rollupOptions: {
            output: {
                chunkFileNames: 'js/[name]-[hash].js', // 引入文件名的名称
                entryFileNames: 'js/[name]-[hash].js', // 包的入口文件名称
                assetFileNames: '[ext]/[name]-[hash].[ext]', // 资源文件像 字体，图片等
                manualChunks(id) {
                    if (id.includes('node_modules')) {
                        return id.toString().split('node_modules/')[1].split('/')[0].toString()
                    }
                }
            },
            //打包时不引入外部模块，使用cdn引入
            external: ['vue', , 'element-plus', 'axios', 'vue-demi'],
            plugins: [globals]
        }
    }
})
