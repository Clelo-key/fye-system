import { createRouter, createWebHistory } from 'vue-router'
import type { App } from 'vue'
import HomeView from '@/views/HomeView.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    }
  ]
})

export const setupRouter = (app: App<Element>) => {
  app.use(router)
}

export default router
