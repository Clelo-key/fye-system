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
]

const router = createRouter({
    history: createMemoryHistory(),
    routes
})

router.beforeEach((to, form, next) => {
    console.log(to.path)
    if (to.path == '/login' || to.path == '/home') {
        next()
    } else if (!localStorage.getItem('token')) {
        next(false)
    }
})

export default router
