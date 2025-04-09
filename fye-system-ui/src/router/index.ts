import type { App } from 'vue'
import type { RouteRecordRaw } from 'vue-router'
import systemPath from './modules/systemPath'
import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.VITE_BASE_PATH),
  routes: systemPath as RouteRecordRaw[]
})

export const setupRouter = (app: App<Element>) => {
  app.use(router)
}

export default router
