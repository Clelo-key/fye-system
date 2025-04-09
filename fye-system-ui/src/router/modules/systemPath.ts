import type { RouteRecordRaw } from 'vue-router'
import { lazy } from '../routerHealper'

const systemPath: RouteRecordRaw[] = [
  {
    path: '/',
    component: lazy('../layout/Layout'),
    name: 'Home',
    meta: {
      name: 'Home'
    },
    children: [
      {
        path: 'system/user',
        component: lazy('../views/TestView'),
        name: 'User',
        meta: {
          title: 'user',
          icon: 'ep:home-filled'
        }
      }
    ]
  }
]

export default systemPath
