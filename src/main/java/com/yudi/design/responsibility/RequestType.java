package com.yudi.design.responsibility;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 9:55
 */
public enum RequestType {
    TYPE1(1,"aa"),
    TYPE2(2,"bb"),
    TYPE3(3,"cc");

    private Integer code;
    private String msg;

    RequestType(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }}
