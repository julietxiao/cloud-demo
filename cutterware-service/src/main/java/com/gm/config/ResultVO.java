package com.gm.config;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * @author lhc
 * @description 返回结果VO对象
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {
    public static final Integer SUCCESS = 0;
    public static final Integer FAILED = 1;
    public static final Integer ERROR = 2;
    public static final Integer UNLOG = 3;
    public static final Integer NOAUTH = 4;
    //("状态码 0成功 1失败 2服务器出错 3未登录 4没有权限")
    private Integer code=SUCCESS;

    private String msg;

    //("返回数据")
    private T data;

    private ResultVO() {
        this.code = SUCCESS;
        this.msg = "Action OK";
    }
    private ResultVO(T data) {
        this.code = SUCCESS;
        this.msg = "Action OK";
        this.data = data;
    }

    private ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private ResultVO(Throwable exp){
        this.code=ERROR;
        this.msg=exp.getMessage();
    }
    /**
     * 请求成功  状态码 1
     *
     * @param <T> 类型
     * @return ResultVO
     */
    public static <T> ResultVO getSuccess(T data) {
        return new ResultVO<T>(data);
    }
    /**
     * 请求成功  状态码 1
     *
     * @param <T> 类型
     * @return ResultVO
     */
    public static <T> ResultVO getSuccess() {
        return new ResultVO<T>();
    }
    /**
     * 请求成功  状态码 1
     *
     * @param msg  返回信息
     * @param data 返回对象
     * @param <T>  类型
     * @return ResultVO
     */
    public static <T> ResultVO getSuccess(String msg, T data) {
        return new ResultVO<T>(SUCCESS, msg, data);
    }

    /**
     * 请求失败   状态码 0
     *
     * @param msg 返回信息
     * @param <T> 类型
     * @return ResultVO
     */
    public static <T> ResultVO getFailed(String msg) {
        return new ResultVO<T>(FAILED, msg);
    }

    /**
     * 请求失败  状态 0
     *
     * @param msg  返回信息
     * @param data 返回数据
     * @param <T>  类型
     * @return ResultVO
     */
    public static <T> ResultVO getFailed(String msg, T data) {
        return new ResultVO<T>(FAILED, msg, data);
    }


    /**
     * 用户未登录
     *
     * @param <T> 类型
     * @return ResultVO
     */
    public static <T> ResultVO getNoLogin() {
        return new ResultVO<T>(UNLOG, "用户未登录，请重新登录");
    }


    /**
     * 用户没有操作权限
     *
     * @param <T> 类型
     * @return ResultVO
     */
    public static <T> ResultVO getNoAuthorization() {
        return new ResultVO<T>(NOAUTH, "用户没有操作权限，请重新登录");
    }

    public static <T> ResultVO getException(Throwable exp) {
        return new ResultVO<T>(exp);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
