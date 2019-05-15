package com.yudi.design.strategy;

/**
 * @ClassName :Pay
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:15
 * @Version :1.0
 */
public class Pay {
    private PayBehavior payBehavior;

    public Pay(PayBehavior payBehavior) {
        this.payBehavior = payBehavior;
    }

    public void wakeUp() {
        if (payBehavior != null) {
            payBehavior.wakeUp();
        }
    }
}
