package com.yudi.design.responsibility;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 10:34
 */
public class Handler3 extends Handler {
    public Handler3(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType().getCode() == 3) {
            System.out.println(request.getName() + " is handle by Handler3");
            return;
        }
        if (handler!=null){
            handler.handleRequest(request);
        }
    }
}
