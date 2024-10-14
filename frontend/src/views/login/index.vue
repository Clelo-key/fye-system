<template>
    <div class="login-container">
        <div class="header">
            <div class="welcome-info">欢迎来到黑马点评</div>
        </div>
        <div class="content">
            <div class="login-form">
                <el-input placeholder="请输入用户名或者手机号" :minlength="11" :maxlength="11" v-model="form.phone">
                </el-input>
                <el-input placeholder="请输入密码" v-model="form.password" show-password> </el-input>
            </div>
            <div class="login-button">
                <el-button @click="login" :class="{ 'valid-pass': validationInput }"> 确认登录 </el-button>
            </div>
        </div>
    </div>
</template>

<script setup>
import loginService from '@/api/login'
import { ElMessage } from 'element-plus'
import { computed } from 'vue'
const form = ref({ phone: '', password: '' })

// 有效输入
const validationInput = computed(() => {
    let staus = true
    for (let key in form.value) {
        if (!form.value[key]) {
            staus = false
        }
    }
    return staus
})

function login() {
    if (!validationInput.value) {
        ElMessage.error('请输入相关信息')
        return
    }
    loginService.login(form.value).then(({ data }) => {
        if (data) {
            console.log(data)
            // 保存用户信息到session
            sessionStorage.setItem('token', data)
        }
    })
}
</script>

<style lang="less" scoped>
.login-container {
    width: 100%;
    height: 100%;
    flex: 1;
    box-sizing: content-box;
    .header {
        width: 100%;
        height: 200px;
        .welcome-info {
            text-align: center;
            font-size: 30px;
            font-weight: bold;
            padding-top: 70px;
        }
    }
    .content {
        width: 100%;
        height: calc(100% - 200px);
        .login-form {
            :deep(.el-input) {
                margin-top: 10px;
                height: 40px;
                .el-input__wrapper {
                    border: 0px;
                }
            }
        }
        .login-button {
            width: 100%;
            text-align: center;
            :deep(.el-button) {
                width: 150px;
                height: 50px;
                margin-top: 20px;
                font-size: 16px;
                border-radius: 10px;
            }
            .valid-pass {
                color: rgb(77, 192, 238);
            }
        }
    }
}
</style>
