import { createMemoryHistory, createRouter } from 'vue-router'

import home from './home'
import message from './message'
import user from './user'
import map from './map'
import login from './login'

const routes = [
    {
        path: '/',
        redirect: '/home',
        children: [].concat(home, message, user, map, login)
    }
    // {
    //     path: '/:pathMatch(.*)*',
    //     component: () => import('@/views/error/index.vue'),
    //     hidden: true
    // }
    // {
    //     path: '*',
    //     redirect: '/404'
    // }
]

const router = createRouter({
    history: createMemoryHistory(),
    routes
})

export default router
