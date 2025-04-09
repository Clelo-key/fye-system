<script lang="tsx">
  import { useSystemStore } from '@/stores/systemLayout'
  import { LayoutType } from '@/types/layout'
  import { ElMenu, ElScrollbar } from 'element-plus'
  // 示例：在组件或工具文件中导入
  import { computed, defineComponent, unref } from 'vue'
  import testPath from '@/router/modules/testPath'
  import MenuItem from './components/MenuItem.vue'
  import { isUrl } from '@/utils/is'
  import { useRouter } from 'vue-router'
  import { Logo } from '@/layout/components/Logo'
  export default defineComponent({
    name: 'Menu',
    setup() {
      const systemStore = useSystemStore()
      const { push, currentRoute } = useRouter()
      const layout = computed(() => systemStore.mode)
      const uniqueOpened = computed(() => systemStore.getUniqueOpened)
      const menuMode = computed((): 'vertical' | 'horizontal' => {
        const vertical: LayoutType[] = ['classic', 'topLeft']

        if (vertical.includes(unref(layout))) {
          return 'vertical'
        } else {
          return 'horizontal'
        }
      })

      const collapse = computed(() => {
        return systemStore.getCollapse
      })

      // 判断是否是外站链接，是则跳转
      const menuSelect = (path: string) => {
        if (isUrl(path)) {
          window.open(path)
        } else {
          push(path)
        }
      }
      const activeMenu = computed(() => {
        return currentRoute.value.path
      })

      return () => (
        <div
          class={[
            'fye-menu h-full overflow-hidden  border-r-1 border-r-solid border-[--el-menu-border-color] transition-[width] duration-220 ease-liner',
            {
              'w-[var(--left-menu-min-width)]': unref(collapse),
              'w-[var(--left-menu-max-width)]': !unref(collapse)
            }
          ]}
        >
          <Logo></Logo>
          <ElScrollbar height={'calc(100vh - var(--left-logo-height))'}>
            <ElMenu
              default-active={unref(activeMenu)}
              mode={unref(menuMode)}
              collapse={unref(collapse)}
              uniqueOpened={unref(uniqueOpened)}
              onSelect={menuSelect}
              collapse-transition={false}
              hide-timeout={800}
            >
              <MenuItem routers={unref(testPath)} />
            </ElMenu>
          </ElScrollbar>
        </div>
      )
    }
  })
</script>

<style lang="scss" scoped>
  :deep(.el-sub-menu) {
    &.is-active {
      > .el-sub-menu__title {
        color: var(--el-menu-active-color) !important;
      }
    }
  }
  :deep(.el-menu) {
    border-right: none;
  }
  :deep(.el-menu--collapse) {
    width: var(--left-menu-min-width);
  }

  // 修复菜单收缩时的卡顿问题（在收缩菜单时就隐藏文字）
  //   :deep(.horizontal-collapse-transition) {
  //     .fye-menu-title {
  //       display: none;
  //     }
  //   }
</style>
