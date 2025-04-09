<script lang="ts" setup>
  import { propTypes } from '@/utils/propValidation/propTypes'
  import { Icon } from '@iconify/vue'
  import { computed, unref } from 'vue'

  defineOptions({ name: 'Icon' })

  const props = defineProps({
    // icon name
    icon: propTypes.string,
    // icon color
    color: propTypes.string,
    // icon size
    size: propTypes.number.def(16)
  })
  const isLocalIcon = computed(() => props.icon.startsWith('fye-svg'))
  const fontSize = computed(() => props.size * 0.25 + 'rem')
</script>
<template>
  <span
    v-if="unref(isLocalIcon)"
    :class="`${props.icon}`"
    :style="{ fontSize: unref(fontSize), color: props.color }"
  ></span>
  <Icon
    v-else
    class="el-icon"
    :icon="props.icon"
    :color="props.color"
    :width="props.size"
    :height="props.size"
  />
</template>
<style lang="scss" scoped>
  .el-icon {
    width: 1em !important;
    height: 1em !important;
    vertical-align: bottom !important;
  }
</style>
