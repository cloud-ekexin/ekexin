package com.xiaofenhao.common.response;

import lombok.Getter;

@Getter
public enum ResponseCode {

    SUCCESS("00000", "成功"),
    FAILURE("C0001", "服务器错误");

    /**
     * 错误码
     */
    private final String code;

    /**
     * 错误信息
     */
    private final String message;

    ResponseCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

}