import http from '@/utils/http'

export default {
    login({ mobile, password }) {
        return http.post('/app-api/member/auth/login', { mobile, password }).then((res) => {
            return res.data
        })
    }
}
