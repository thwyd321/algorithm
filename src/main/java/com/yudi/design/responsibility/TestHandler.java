package com.yudi.design.responsibility;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 10:12
 */
public class TestHandler {

    public static void main(String[] args) {
        Request request1 = new Request(RequestType.TYPE1,"request1");
        Request request2 = new Request(RequestType.TYPE2,"request2");
        Request request3 = new Request(RequestType.TYPE3,"request3");

        Handler handler1 = new Handler1(null);
        Handler handler2 = new Handler2(handler1);
        Handler handler3 = new Handler3(handler2);

        handler3.handleRequest(request1);
        handler3.handleRequest(request2);
        handler3.handleRequest(request3);
    }


}
