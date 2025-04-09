<script lang="tsx">
  import { ElMenuItem, ElSubMenu } from 'element-plus'
  import { defineComponent, PropType } from 'vue'
  import MenuTitle from './MenuTitle.vue'
  import { getFullPath } from '@/router/routerHealper'

  export default defineComponent({
    name: 'MenuItem',
    props: {
      routers: {
        type: Array as PropType<AppRouteRecordRaw[]>,
        required: true
      }
    },
    setup(props) {
      const renderMenuItem = (router: AppRouteRecordRaw[], parentPath: string) =>
        router
          .filter((v: any) => !v.meta.hidden)
          .map((v) => {
            const meta = v.meta
            const fullPath = getFullPath(parentPath, v.path)
            if (!v.children) {
              return (
                <ElMenuItem index={fullPath}>
                  {{
                    default: () => <MenuTitle meta={meta} />
                  }}
                </ElMenuItem>
              )
            } else {
              return (
                <ElSubMenu index={fullPath}>
                  {{
                    title: () => <MenuTitle meta={meta} />,
                    default: () => renderMenuItem(v.children as AppRouteRecordRaw[], fullPath)
                  }}
                </ElSubMenu>
              )
            }
          })
      return () => renderMenuItem(props.routers, '')
    }
  })
</script>
