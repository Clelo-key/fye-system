<template>
    <div class="login-container">
        <div class="header">
            <div class="header-title">密码登录</div>
            <div class="welcome-info">黑马点评欢迎您</div>
        </div>
        <div class="content">
            <div class="login-form">
                <el-input placeholder="请输入用户名或者手机号" :minlength="11" :maxlength="11" v-model="form.phone">
                </el-input>
                <el-input placeholder="请输入密码" v-model="form.password" show-password> </el-input>
            </div>
            <div class="login-button" @click="login">
                <el-button :disabled="validationInput"> 确认登录 </el-button>
            </div>
        </div>
    </div>
</template>

<script setup>
import loginService from '@/api/login'
import { ElMessage } from 'element-plus'
import { computed } from 'vue'
const form = ref({ phone: '', password: '' })

const validationInput = computed(() => {
    let staus = false
    for (let key in form.value) {
        if (!form.value[key]) {
            staus = true
        }
    }
    return staus
})

function login() {
    loginService
        .login(form.value)
        .then(({ data }) => {
            if (data) {
                console.log(data)
                // 保存用户信息到session
                sessionStorage.setItem('token', data)
            }
        })
        .catch((err) => ElMessage.error(err))
}
</script>

<style lang="less" scoped>
.login-container {
    width: 100%;
    height: 100%;
    box-sizing: border-box;

    padding: 10px;
    .header {
        width: 100%;
        height: 200px;
        .welcome-info {
            text-align: center;
            font-size: 30px;
            font-weight: bold;
            margin-top: 70px;
        }
    }
    .content {
        width: 100%;
        height: calc(100% - 200px);
        .login-form {
            :deep(.el-input) {
                margin-top: 10px;
                height: 40px;
            }
        }
        .login-button {
            width: 100%;
            text-align: center;
            :deep(.el-button) {
                width: 120px;
                height: 50px;
                margin-top: 20px;
                font-size: 16px;
            }
        }
    }
}
</style>
