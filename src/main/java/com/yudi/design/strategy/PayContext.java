package com.yudi.design.strategy;

/**
 * @ClassName :PayContext
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:18
 * @Version :1.0
 */
public class PayContext {

    public void wakeUp(int payType){
        if (1==payType){
            new AliPay().wakeUp();
        }else if (2==payType){
            new WechatPay().wakeUp();
        }

    }

}
