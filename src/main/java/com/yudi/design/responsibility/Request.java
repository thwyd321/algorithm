package com.yudi.design.responsibility;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 9:55
 */
public class Request {
    private RequestType requestType;
    private String name;

    public Request(RequestType requestType, String name) {
        this.requestType = requestType;
        this.name = name;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
