package com.jyl.game.web.pojo.enumCode;

/**
 * @Auther: pc
 * @Date: 2019-08-18 13:46
 * @Description:
 */
public enum ErrorCode {
    /**
     * code
     */
    SYSTEMCODE(500, "SYSTEMCODE", "系统错误"),
    PARAM_NOT_NULL(400,"PARAMNOTNULL","参数不能为空")
    ;

    private int HttpCode;

    private String Code;

    private String message;

    ErrorCode(int httpCode, String code, String message) {
        HttpCode = httpCode;
        Code = code;
        this.message = message;
    }

    public int getHttpCode() {
        return HttpCode;
    }

    public void setHttpCode(int httpCode) {
        HttpCode = httpCode;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
