package com.xiaofenhao.common.response;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 通用返回结构
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
@Data
@Accessors(chain = true)
public class R<T> implements Serializable {

    private static final long serialVersionUID = -1985477828472064029L;

    /**
     * 状态码
     */
    private String code;

    /**
     * 消息提示
     */
    private String message;

    /**
     * 消息内容
     */
    private T data;

    private R(ResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
    }

    private R(ResponseCode responseCode) {
        this(responseCode, null);
    }

    private R(T data) {
        this(ResponseCode.SUCCESS, data);
    }

    private R() {
        this(ResponseCode.SUCCESS, null);
    }

    public static <T> R<T> success() {
        return new R<T>();
    }

    public static <T> R<T> success(T data) {
        return new R<T>(data);
    }

    public static <T> R<T> failure(ResponseCode responseCode) {
        return new R<T>(responseCode);
    }

    public static <T> R<T> failure(ResponseCode responseCode, T data) {
        return new R<T>(responseCode, data);
    }
}