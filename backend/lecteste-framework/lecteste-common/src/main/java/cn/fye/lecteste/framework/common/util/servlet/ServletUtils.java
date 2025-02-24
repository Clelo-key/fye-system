package cn.fye.lecteste.framework.common.util.servlet;

import cn.fye.lecteste.framework.common.util.json.JsonUtils;
import cn.hutool.extra.servlet.JakartaServletUtil;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.MediaType;


/**
 * @Author: Fly
 * @CreateTime: 2024-11-28
 * @Version: 1.0
 */
public class ServletUtils {
    /**
     * 返回 JSON 字符串
     *
     * @param response 响应
     * @param object   对象，会序列化成 JSON 字符串
     */
    @SuppressWarnings("deprecation") // 必须使用 APPLICATION_JSON_UTF8_VALUE，否则会乱码
    public static void writeJSON(HttpServletResponse response, Object object) {
        String content = JsonUtils.toJsonString(object);
        JakartaServletUtil.write(response, content, MediaType.APPLICATION_JSON_UTF8_VALUE);
    }

}
