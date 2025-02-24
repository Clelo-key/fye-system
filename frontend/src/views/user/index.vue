<template>
    <div>Hello User</div>
    <label v-for="i in chooseOption"> {{ i }}<input type="checkbox" :value="i" v-model="hoybies" /> </label>
    <br />
    <label>{{ hoybies }}</label>
</template>

<script setup>
import login from '@/api/login'
const hoybies = ref([])
const chooseOption = ref(['篮球', '足球', '乒乓球'])
</script>

<style lang="less" scoped></style>
