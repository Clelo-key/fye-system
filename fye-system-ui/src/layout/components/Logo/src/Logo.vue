<template>
  <router-link to="/" class="fye-logo h-[--left-logo-height] no-underline flex items-center p-1">
    <!-- <el-avatar class="ml-[0.4em]" shape="circle" :size="45" :src="logo" /> -->
    <div class="w-10 h-10 ml-[0.5em]">
      <FyeIcon :icon="'fye-svg:logo'" :size="10" />
    </div>
    <span class="ml-[1em] font-bold text-[--left-logo-name-color]" v-if="!unref(collapse)">{{
      title
    }}</span>
  </router-link>
</template>

<script lang="ts" setup>
  import FyeIcon from '@/components/Icon/src/FyeIcon.vue'
  import { useSystemStore } from '@/stores/systemLayout'
  import { computed, unref } from 'vue'

  const systemStore = useSystemStore()

  const collapse = computed((): boolean => systemStore.getCollapse)

  defineProps({
    logo: {
      type: String,
      default: '@/assets/logo.svg'
    },
    title: {
      type: String,
      default: 'FyeSystem'
    }
  })
</script>
