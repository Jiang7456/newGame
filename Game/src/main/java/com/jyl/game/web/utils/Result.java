package com.jyl.game.web.utils;

import com.jyl.game.web.pojo.enumCode.EnumCode;
import com.jyl.game.web.pojo.enumCode.ErrorCode;

/**
 * @Auther: pc
 * @Date: 2019-08-18 13:51
 * @Description:
 */
public class Result<T> {

    private T data;
    private String errorCode;
    private String message;


    public static <T> Result<T> createResponse(T data) {
        Result<T> response = new Result<T>();
        response.setData(data);
        return response;
    }

    public static <T> Result<T> createErrorResponse(ErrorCode errorCode) {
        Result<T> response = new Result<T>();
        response.setErrorCode(errorCode.getCode());
        response.setMessage(errorCode.getMessage());
        return response;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
