package com.yudi.design.strategy;

/**
 * @ClassName :AliPay
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:08
 * @Version :1.0
 */
public class AliPay implements PayBehavior {

    @Override
    public void wakeUp() {
        System.out.println("支付宝支付");
    }
}
