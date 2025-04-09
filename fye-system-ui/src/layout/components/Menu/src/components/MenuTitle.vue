<script lang="tsx">
  import { FyeIcon } from '@/components/Icon'
  import { defineComponent, PropType } from 'vue'
  import type { RouteMeta } from 'vue-router'

  export default defineComponent({
    name: 'MenuTitle',
    props: {
      meta: {
        type: Object as PropType<RouteMeta>,
        required: true
      }
    },
    setup(props) {
      return () => (
        <>
          <FyeIcon icon={props.meta.icon}></FyeIcon>
          <span class="fye-menu-title">{props.meta.title}</span>
        </>
      )
    }
  })
</script>
