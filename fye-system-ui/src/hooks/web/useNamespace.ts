import variables from '@/styles/global.module.scss'

export const useNamespace = () => {
  const scssVariables = variables
  /**
   * @param scope 类名
   * @returns 返回空间名-类名
   */
  const getPrefixCls = (scope: string) => {
    return `${scssVariables}-${scope}`
  }

  return {
    variables: scssVariables,
    getPrefixCls
  }
}
