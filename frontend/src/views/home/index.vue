<template>
    <div>{{ myinfo ?? 'Hello World' }}</div>
    <el-button @click="clickMe">ClickMe</el-button>
</template>

<script setup>
import login from '@/api/login'

var myinfo = ref(null)

onMounted(() => {})
function clickMe() {
    login.getBackend().then((res) => {
        myinfo.value = res.data
    })
}
</script>

<style lang="less" scoped></style>
