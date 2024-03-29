package com.example.lcc.comm;

import lombok.Data;


/**
 * @author Licc   lcc2 分支测试推送
 * @author Licc 推送到test分支
 * @date 2023/2/2 10:49 PM
 * 封装结果集
 */
@Data
public class Result<T> {

    private  Integer code;
    private String msg;
    private T data;


    public  static  <T> Result<T> success(){
        return  new Result<>();
    }

    /***
     *   成功默认状态码，返回消息，自定义返回数据
     * @param data  自定义返回集
     * @return   通用返回Result
     * @param <T>  返回泛型，不能为String
     */
    public  static  <T> Result<T> success(T data){
        return  new Result<>(data);
    }

    /**
     *
     * @param msg  自定义返回消息
     * @param data 自定义返回数据
     * @return       通过返回Result
     * @param <T>   返回类泛型
     */
    public static<T>  Result<T>  success(String msg ,T data){
        return new Result<>(msg,data);
    }


    /**
     *   成功，默认状态码，自定义返回消息，无返回数据
     * @param msg  自定义返回消息
     * @return   通过返回Result
     * @param <T>  返回类泛型
     */
    public static <T> Result<T> success(String msg){
        return new Result<>(msg);
    }

    public static <T> Result<T> fail(){
        return  new Result<>(ResultCode.ERROR);
    }
    /**
     * 失败,默认状态码,自定义返回消息,无返回数据
     * @param <T> 返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error(String msg) {
        return new Result<>(ResultCode.ERROR.getCode(), msg);
    }
    /**
     * 失败,自定义状态码,返回消息,无返回数据
     * @param code 自定义状态码
     * @param msg  自定义返回消息
     * @param <T>  返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error(int code, String msg) {
        return new Result<>(code, msg);
    }
    /**
     * 失败,使用CodeMsg状态码,返回消息,无返回数据
     * @param resultCode CodeMsg,参数如下:
     *                   <p> code 状态码
     *                   <p> msg  返回消息
     * @param <T>        返回类泛型
     * @return 通用返回Result
     */
    public static <T> Result<T> error(ResultCode resultCode) {
        return new Result<>(resultCode);
    }
    /**
     * 成功构造器,无返回数据
     */
    private Result() {
        this(ResultCode.SUCCESS);
    }
    /**
     * 成功构造器,自定义返回数据
     * @param data 返回数据
     */
    private Result(T data) {
        this(ResultCode.SUCCESS, data);
    }
    /**
     * 成功构造器,自定义返回消息,无返回数据
     * @param msg 返回消息
     */
    private Result(String msg) {
        this(ResultCode.SUCCESS.getCode(), msg);
    }
    /**
     * 构造器,自定义状态码,返回消息
     * @param code 状态码
     * @param msg  返回消息
     */
    private Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    /**
     * 成功构造器,自定义返回信息,返回数据
     * @param msg  返回信息
     * @param data 返回数据
     */
    private Result(String msg, T data) {
        this(ResultCode.SUCCESS.getCode(), msg, data);
    }

    /**
     * 构造器,自定义状态码,返回消息,返回数据
     * @param code 状态码
     * @param msg  返回消息
     * @param data 返回数据
     */
    private Result(int code, String msg, T data) {
        this(code, msg);
        this.data = data;
    }
    /**
     * 构造器,使用CodeMsg状态码与返回信息,自定义返回数据
     * @param resultCode CodeMsg,参数如下:
     *                   <p> code 状态码
     *                   <p> msg  返回消息
     * @param data       返回数据
     */
    private Result(ResultCode resultCode, T data) {
        this(resultCode);
        this.data = data;
    }

    /**
     * 构造器,使用CodeMsg状态码与返回信息
     * @param resultCode CodeMsg,参数如下:
     *                   <p> code 状态码
     *                   <p> msg  返回消息
     */
    private Result(ResultCode resultCode) {
        this(resultCode.getCode(), resultCode.getMsg());
    }

}