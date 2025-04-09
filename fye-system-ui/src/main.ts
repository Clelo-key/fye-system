// 引入全局样式
import '@/plugins/unocss'
import '@/styles/index.scss'
import 'element-plus/dist/index.css'

// 路由
import { createApp } from 'vue'
import { createPinia } from 'pinia'
// 引入 element-plus
// import { setupElementPlus } from '@/plugins/elementPlus'
import ElementPlus from 'element-plus'

import App from './App.vue'
import { setupRouter } from '@/router'

const setupAll = async () => {
  const app = createApp(App)

  setupRouter(app)

  app.use(createPinia())
  app.use(ElementPlus)

  app.mount('#app')
}

setupAll()
