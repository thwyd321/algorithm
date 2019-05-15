package com.yudi.design.strategy;

/**
 * @ClassName :WechatPay
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:07
 * @Version :1.0
 */
public class WechatPay implements PayBehavior{

    /**
     * 唤起支付
     */
    @Override
    public void wakeUp() {
        System.out.println("微信支付");
    }

}
