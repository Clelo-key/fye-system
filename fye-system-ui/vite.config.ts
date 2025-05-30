import path from 'path'
import { defineConfig, loadEnv } from 'vite'
import { exclude, include } from './build/vite/optimize'
import { createVitePlugins, createViteBuild } from './build/vite'

// 当前执行node命令时文件夹的地址(工作目录)
const root = process.cwd()

// https://vite.dev/config/
export default defineConfig(({ mode, command }) => {
  // Load env file based on `mode` in the current working directory.
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  let env = {} as any
  const isBuild = command === 'build'
  if (!isBuild) {
    env = loadEnv(process.argv[3] === '--mode' ? process.argv[4] : process.argv[3], root)
  } else {
    env = loadEnv(mode, root)
  }
  return {
    server: {
      proxy: {
        '/app-api': {
          target: 'http://127.0.0.1:8081', // 后端Base_URl
          changeOrigin: true
        }
      },
      port: env.VITE_PORT,
      host: '0.0.0.0',
      open: env.VITE_OPEN === 'true'
    },
    plugins: createVitePlugins(),
    resolve: {
      alias: {
        '@': path.resolve(__dirname, './src')
      }
    },
    build: createViteBuild(),
    optimizeDeps: { include, exclude }
  }
})
