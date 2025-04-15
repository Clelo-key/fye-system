package cn.fye.clould.framework.common.util.servlet;

import cn.fye.clould.framework.common.util.json.JsonUtil;
import cn.hutool.core.exceptions.UtilException;
import cn.hutool.core.io.IoUtil;
import org.springframework.http.MediaType;
import jakarta.servlet.http.HttpServletResponse;
import cn.hutool.extra.servlet.ServletUtil;

import java.io.IOException;
import java.io.Writer;

/**
 * @Author: Fly
 * @CreateTime: 2025-04-12
 * @Version: 1.0
 */
public class ServletUtils {
    /**
     * 返回 JSON 字符串
     *
     * @param response 响应
     * @param object   对象，会序列化成 JSON 字符串
     */
    public static void writeJSON(HttpServletResponse response, Object object) {
        String content = JsonUtil.toJsonString(object);
//        ServletUtil.write(response, content, MediaType.APPLICATION_JSON_UTF8_VALUE);
        response.setContentType(MediaType.APPLICATION_JSON_UTF8_VALUE);
        Writer writer = null;
        try {
            writer = response.getWriter();
            ((Writer) writer).write(content);
            ((Writer) writer).flush();
        } catch (IOException var8) {
            IOException e = var8;
            throw new UtilException(e);
        } finally {
            IoUtil.close(writer);
        }

    }
}
