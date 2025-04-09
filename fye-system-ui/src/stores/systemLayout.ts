import { LayoutType } from '@/types/layout'
import { defineStore } from 'pinia'

interface MenuProps {
  /**
   * 菜单展示模式
   */
  mode: LayoutType

  /**
   * 是否水平折叠收起菜单（仅在 mode 为 vertical 时可用）
   */
  collapse: boolean

  /**
   * 是否省略多余的子项（仅在横向模式生效）
   */
  ellipsis: boolean

  /**
   * 自定义省略图标 (仅在水平模式下可用)
   */
  ellipsisIcon: string | any // Component 类型需根据实际框架类型定义

  /**
   * 弹出层的偏移量(对所有子菜单有效)
   */
  popperOffset: number

  /**
   * 页面加载时默认激活菜单的 index
   */
  defaultActive: string

  /**
   * 默认打开的 sub-menu 的 index 的数组
   */
  defaultOpeneds: string[]

  /**
   * 是否只保持一个子菜单的展开
   */
  uniqueOpened: boolean

  /**
   * 子菜单打开的触发方式，只在 mode 为 horizontal 时有效
   */
  menuTrigger: 'hover' | 'click'

  /**
   * 是否启用 vue-router 模式
   */
  router: boolean

  /**
   * 是否开启折叠动画
   */
  collapseTransition: boolean

  /**
   * Tooltip 主题，内置了 dark / light 两种主题
   */
  popperEffect: 'dark' | 'light' | string

  /**
   * 单击外部时是否折叠菜单
   */
  closeOnClickOutside: boolean

  /**
   * 为 popper 添加类名
   */
  popperClass: string

  /**
   * 菜单出现前的延迟（毫秒）
   */
  showTimeout: number

  /**
   * 菜单消失前的延迟（毫秒）
   */
  hideTimeout: number

  /**
   * @deprecated 推荐使用 CSS 变量 --el-menu-bg-color
   */
  backgroundColor: string

  /**
   * @deprecated 推荐使用 CSS 变量 --el-menu-text-color
   */
  textColor: string

  /**
   * @deprecated 推荐使用 CSS 变量 --el-menu-active-color
   */
  activeTextColor: string

  /**
   * 当菜单处于非活动状态且 persistent 为 false 时，下拉菜单将被销毁
   */
  persistent: boolean
}

export const useSystemStore = defineStore('SystemLayout', {
  state: (): MenuProps => {
    return {
      mode: 'classic',
      collapse: false,
      ellipsis: true,
      ellipsisIcon: undefined,
      popperOffset: 6,
      defaultActive: '',
      defaultOpeneds: [],
      uniqueOpened: true,
      menuTrigger: 'hover',
      router: false,
      collapseTransition: true,
      popperEffect: 'dark',
      closeOnClickOutside: false,
      popperClass: '',
      showTimeout: 300,
      hideTimeout: 300,
      backgroundColor: '#ffffff',
      textColor: '#303133',
      activeTextColor: '#409eff',
      persistent: true
    }
  },
  getters: {
    // 基础属性
    getMode(): LayoutType {
      return this.mode
    }, // 注意这里添加逗号

    getCollapse(): boolean {
      return this.collapse
    }, // 逗号在方法体后

    getEllipsis(): boolean {
      return this.ellipsis
    }, // 保持逗号统一

    // 图标相关
    getEllipsisIcon(): string {
      return this.ellipsisIcon
    }, // 注释后加逗号

    // 弹出层控制
    getPopperOffset(): number {
      return this.popperOffset
    }, // 数值类型方法

    // 状态管理
    getDefaultActive(): string {
      return this.defaultActive
    }, // 字符串类型

    getDefaultOpeneds(): string[] {
      return this.defaultOpeneds
    }, // 数组类型

    getUniqueOpened(): boolean {
      return this.uniqueOpened
    }, // 布尔值

    // 交互控制
    getMenuTrigger(): 'hover' | 'click' {
      return this.menuTrigger
    }, // 枚举值

    // 路由集成
    getRouter(): boolean {
      return this.router
    }, // 路由标识

    // 动画控制
    getCollapseTransition(): boolean {
      return this.collapseTransition
    }, // 动画开关

    // 主题控制
    getPopperEffect(): string {
      return this.popperEffect
    }, // 主题类型

    // 外部交互
    getCloseOnClickOutside(): boolean {
      return this.closeOnClickOutside
    }, // 点击外部

    // 样式控制
    getPopperClass(): string | undefined {
      return this.popperClass
    }, // 类名字符串

    // 时序控制
    getShowTimeout(): number {
      return this.showTimeout
    }, // 显示延迟

    getHideTimeout(): number {
      return this.hideTimeout
    }, // 隐藏延迟

    // 已弃用属性（带警告）
    /** @deprecated 使用 CSS 变量 --el-menu-bg-color 替代 */
    getBackgroundColor(): string {
      return this.backgroundColor
    }, // 废弃属性

    /** @deprecated 使用 CSS 变量 --el-menu-text-color 替代 */
    getTextColor(): string {
      return this.textColor
    }, // 第二个废弃属性

    /** @deprecated 使用 CSS 变量 --el-menu-active-color 替代 */
    getActiveTextColor(): string {
      return this.activeTextColor
    }, // 最后一个废弃属性

    // 生命周期控制
    getPersistent(): boolean {
      return this.persistent
    } // 最后一个方法不加逗号
  },
  actions: {
    setCollapse(collapse: boolean) {
      this.collapse = collapse
    }
  }
})
