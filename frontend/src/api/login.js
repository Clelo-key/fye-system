import http from '@/utils/http'

export default {
    login({ phone, password }) {
        return http.post('/api/user/login', { phone, password }).then((res) => {
            return res.data
        })
    }
}
