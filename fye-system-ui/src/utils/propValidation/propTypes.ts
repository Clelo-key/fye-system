import { PropType } from 'vue'
import { VueTypeValidableDef, VueTypesInterface, createTypes, toValidableType } from 'vue-types'

type PropTypes = VueTypesInterface & {
  readonly router: VueTypeValidableDef<AppRouteRecordRaw[]>
}
const newPropTypes = createTypes({}) as PropTypes

class propTypes extends newPropTypes {
  static get router() {
    return toValidableType('router', {
      type: Array as PropType<AppRouteRecordRaw[]>,
      validator: (t: AppRouteRecordRaw[]) => t.length > 10
    })
  }
}

export { propTypes }
