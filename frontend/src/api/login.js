import http from '@/utils/http'

export default {
    login({ phone, password }) {
        return http.post('/app-api/member/auth/login', { phone, password }).then((res) => {
            return res.data
        })
    }
}
