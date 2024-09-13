<template>
    <div class="foot">
        <div class="foot-box" :class="{ active: activeBtn === 1 }" @click="toPage(1)">
            <div class="foot-view"><i class="el-icon-s-home"></i></div>
            <div class="foot-text">首页</div>
        </div>
        <div class="foot-box" :class="{ active: activeBtn === 2 }" @click="toPage(2)">
            <div class="foot-view"><i class="el-icon-map-location"></i></div>
            <div class="foot-text">地图</div>
        </div>
        <div class="foot-box" @click="toPage(0)">
            <img class="add-btn" src="/imgs/add.png" alt="" />
        </div>
        <div class="foot-box" :class="{ active: activeBtn === 3 }" @click="toPage(3)">
            <div class="foot-view"><i class="el-icon-chat-dot-round"></i></div>
            <div class="foot-text">消息</div>
        </div>
        <div class="foot-box" :class="{ active: activeBtn === 4 }" @click="toPage(4)">
            <div class="foot-view"><i class="el-icon-user"></i></div>
            <div class="foot-text">我的</div>
        </div>
    </div>
</template>
<script setup>
import { ref } from 'vue'
import router from '@/router'
defineProps({
    msg: String
})

const activeBtn = ref(0)

function toPage(i) {
    activeBtn.value = i
    switch (i) {
        case 0: {
            router.push('add')
            break
        }
        case 1: {
            router.push('home')
            break
        }
        case 2: {
            router.push('map')
            break
        }
        case 3: {
            router.push('message')
            break
        }
        case 4: {
            router.push('/user')
            break
        }
        default: {
            router.push('home')
        }
    }
}
</script>

<style scoped lang="less">
.foot {
    width: 100%;
    height: 40px;
    display: flex;
    position: fixed;
    background-color: white;
    bottom: 0;
    .foot-box {
        width: calc(100% / 5);
        height: 40px;
        text-align: center;
        line-height: 40px;
        flex: 1;
        cursor: pointer;
        &:focus {
            background-color: rgb(191, 200, 200);
        }
        &.active {
            background-color: rgb(159, 182, 188);
        }
        .add-btn {
            margin-top: 2px;
            width: 35px;
            height: 35x;
        }
    }
}
</style>
