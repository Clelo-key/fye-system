import http from '@/utils/http'

export default {
    login({ phone, password }) {
        console.log(phone)
        return http.post('/api/user/login', { phone, password }).then((res) => {
            return res.data
        })
    }
}
