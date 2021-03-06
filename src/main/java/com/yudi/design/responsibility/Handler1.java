package com.yudi.design.responsibility;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 10:08
 */
public class Handler1 extends Handler {

    public Handler1(Handler handler) {
        super(handler);
    }

    @Override
    protected void handleRequest(Request request) {
        if (request.getRequestType().getCode() == 1) {
            System.out.println(request.getName()+" is handle by Handler1");
            return;
        }
        if (handler != null){
            handler.handleRequest(request);
        }
    }
}
