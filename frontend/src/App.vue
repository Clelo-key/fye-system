<template>
    <div class="app-view">
        <router-view />
    </div>
    <Footer />
</template>

<script setup>
import { onMounted } from 'vue'
import router from '@/router'
import Footer from './components/footer.vue'
const init = () => {
    const token = localStorage.getItem('token')
    if (!token) {
        router.push('login')
    }
}
onMounted(() => {
    init()
})
</script>

<style scoped>
.app-view {
    width: 100%;
    height: calc(100% - 40px);
    padding: 10px;
    box-sizing: border-box;
    display: flex;
}
</style>
