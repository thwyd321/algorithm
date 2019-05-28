package com.yudi.design.adapter.demo2;

/**
 * @ClassName :CashbackStrategy
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 14:28
 * @Version :1.0
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {

        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
