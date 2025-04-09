import { isUrl } from '@/utils/is'
import type { Component } from 'vue'
const modules = import.meta.glob('../views/**/*.vue', { eager: true })
// 匹配 layout 目录下的所有组件（支持嵌套）
const layout = import.meta.glob('../layout/**/*.vue', { eager: true })

export const lazy = (path: string): Component => {
  path = `${path}.vue`
  if (path.startsWith('../layout/')) {
    return (layout[path] as { default: Component })?.default
  }
  return (modules[path] as { default: Component })?.default
}

export const getFullPath = (parentPath: string, path: string) => {
  if (isUrl(path)) return path
  return path.startsWith('/') ? `${parentPath}${path}` : `${parentPath}/${path}`
}
