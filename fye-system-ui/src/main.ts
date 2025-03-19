import './assets/main.css'

// 引入全局样式
import '@/styles/index.scss'
import 'element-plus/dist/index.css'

// 路由
import { createApp } from 'vue'
import { createPinia } from 'pinia'
// 引入 element-plus
import { setupElementPlus } from '@/plugins/elementPlus'

import App from './App.vue'
import router, { setupRouter } from '@/router'

const setupAll = async () => {
  const app = createApp(App)

  setupRouter(app)
  setupElementPlus(app)

  app.use(createPinia())
  app.use(router)

  app.mount('#app')
}

setupAll()
