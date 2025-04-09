import { defineConfig, presetIcons, presetWind3 } from 'unocss'
import { FileSystemIconLoader } from '@iconify/utils/lib/loader/node-loaders'
import fs from 'fs'

// 本地 SVG 图标存放目录
const iconsDir = './src/assets/svgs'

// 读取本地 SVG 目录，自动生成 `safelist`
const generateSafeList = () => {
  try {
    const svgList = fs
      .readdirSync(iconsDir)
      .filter((file) => file.endsWith('.svg'))
      .map((file) => {
        return `fye-svg:${file.replace('.svg', '')}`
      })
    //  '/^text-[1-100]$/' FyeIcon 动态渲染字体大小 https://unocss.dev/guide/extracting#safelist
    return [...svgList, '^text-[100]/']
  } catch (error) {
    console.error('无法读取图标目录:', error)
    return []
  }
}

export default defineConfig({
  rules: [],
  presets: [
    presetWind3(),
    presetIcons({
      prefix: 'fye-',
      extraProperties: {
        width: '1em',
        height: '1em',
        display: 'inline-block'
      },
      collections: {
        // svg 是图标集合名称，使用 `fye-svg:图标名` 调用
        svg: FileSystemIconLoader(iconsDir, (svg) => {
          // 如果 SVG 文件未定义 `fill` 属性，则默认填充 `currentColor`
          // 这样图标颜色会继承文本颜色，方便在不同场景下适配
          return svg.includes('fill="') ? svg : svg.replace(/^<svg /, '<svg fill="currentColor" ')
        })
      }
    })
  ],
  safelist: generateSafeList() // 动态生成 `safelist`
})
