package com.yudi.design.responsibility;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 10:30
 */
public class Handler2 extends Handler {
    public Handler2(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType().getCode() == 2) {
            System.out.println(request.getName() + " is handle by Handler2");
            return;
        }
        if (handler!=null){
            handler.handleRequest(request);
        }
    }
}
