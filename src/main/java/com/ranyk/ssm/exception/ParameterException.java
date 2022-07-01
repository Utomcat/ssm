package com.ranyk.ssm.exception;

/**
 * CLASS_NAME: ParameterException.java <br/>
 *
 * @author ranyk           <br/>
 * @version V1.0           <br/>
 * @description: 参数异常类  <br/>
 * @date: 2022-07-02 <br/>
 */
@SuppressWarnings("unused")
public class ParameterException extends RuntimeException {

    /**
     * 无参构造函数
     */
    public ParameterException() {
    }

    /**
     * 传入异常信息构造函数
     *
     * @param message 异常信息
     */
    public ParameterException(String message) {
        super(message);
    }

    /**
     * 传入异常信息和异常对象构造函数
     *
     * @param message 异常信息
     * @param cause   异常对象
     */
    public ParameterException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 传入异常对象构造函数
     *
     * @param cause 异常对象
     */
    public ParameterException(Throwable cause) {
        super(cause);
    }

    /**
     * 传入异常信息、异常对象、是否启用或禁用抑制、堆栈跟踪是否应该是可写的 构造函数
     *
     * @param message            异常信息
     * @param cause              异常对象
     * @param enableSuppression  是否启用或禁用抑制
     * @param writableStackTrace 堆栈跟踪是否应该是可写的
     */
    public ParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
