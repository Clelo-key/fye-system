export const isUrl = (path: string): boolean => {
  // fix:修复hash路由无法跳转的问题
  const reg =
    /(((^https?:(?:\/\/)?)(?:[-:&=\+\$,\w]+@)?[A-Za-z0-9.-]+(?::\d+)?|(?:www.|[-:&=\+\$,\w]+@)[A-Za-z0-9.-]+)((?:\/[\+~%#\/.\w-_]*)?\??(?:[-\+=&%@.\w_]*)#?(?:[\w]*))?)$/
  return reg.test(path)
}
