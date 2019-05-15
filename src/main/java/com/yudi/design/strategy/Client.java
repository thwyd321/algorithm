package com.yudi.design.strategy;

/**
 * @ClassName :Client
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:17
 * @Version :1.0
 */
public class Client {
    //策略模式
    public static void main(String[] args) {

        Pay pay1 = new Pay(new AliPay());
        Pay pay2 = new Pay(new WechatPay());

        pay1.wakeUp();
        pay2.wakeUp();

        PayContext payContext = new PayContext();
        payContext.wakeUp(1);
        payContext.wakeUp(2);

    }

}
