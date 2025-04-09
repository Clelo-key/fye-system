<template>
  <div class="h-full w-full flex">
    <div>
      <Menu />
    </div>
    <div class="flex-1">
      <el-button @click="change"> ann</el-button>
      <RouterView />
    </div>
  </div>
</template>

<script lang="ts" setup>
  import { useSystemStore } from '@/stores/systemLayout'
  import Menu from './components/Menu/src/Menu.vue'

  const appstore = useSystemStore()
  const change = () => {
    appstore.setCollapse(!appstore.getCollapse)
  }
</script>
