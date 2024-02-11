package com.itheima.pojo;

/**
 * @author hhm
 * @version 1.0
 */
public class Result {

    private Integer code;
    private String message;
    private Object data;

    public Result(){

    }

    public Result(Integer code,String message,Object data){
        this.code=code;
        this.message=message;
        this.data=data;
    }

    public Integer getCode(){
        return code;
    }
}
