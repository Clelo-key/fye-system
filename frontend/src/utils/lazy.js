const modules = import.meta.glob('@/views/*/*.vue') //
export default (name) => {
    return modules[`/src/views/${name}.vue`]
}
