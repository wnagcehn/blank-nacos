package com.ideapro.blank.common.Exception;

/**
 * 异常抛出
 *
 * @author wangchen
 *         createAt 2019/4/23
 *         updateAt 2019/4/23
 */
public class BizException extends RuntimeException{

    public BizException() {
    }

    public BizException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BizException(String code, String message, Throwable throwable) {
        super(message, throwable);
        this.code = code;
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BizException(Throwable throwable) {
        super(throwable);
    }

    /**
     * 错误编码 </br>
     */
    private String code = "";

    public String getCode() {
        return code;
    }
}
 
