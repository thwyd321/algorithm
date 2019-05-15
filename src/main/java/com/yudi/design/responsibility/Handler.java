package com.yudi.design.responsibility;

/**
 * @Description :
 * 责任链
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链发送该请求，直到有一个对象处理它为止。
 * @Author : wangyudi
 * @Date : 2019/5/13 9:53
 */
public abstract class Handler {
    protected Handler handler;

    public Handler(Handler handler) {
        this.handler = handler;
    }
    protected abstract void handleRequest(Request request);
}
