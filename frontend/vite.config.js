// vite.config.ts
import { defineConfig } from 'vite'
import AutoImport from 'unplugin-auto-import/vite'
import Components from 'unplugin-vue-components/vite'
import { ElementPlusResolver } from 'unplugin-vue-components/resolvers'
import vue from '@vitejs/plugin-vue'
import path from 'path'

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
        //自动引入
        AutoImport({
            imports: ['vue'],
            dts: 'src/auto-import.d.ts',
            resolvers: [ElementPlusResolver()]
        }),
        Components({
            resolvers: [ElementPlusResolver()]
        })
    ]
})
