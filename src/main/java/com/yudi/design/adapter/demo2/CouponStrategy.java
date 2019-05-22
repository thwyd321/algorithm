package com.yudi.design.adapter.demo2;

/**
 * @ClassName :CouponStrategy
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 13:59
 * @Version :1.0
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,课程的价格直接减优惠券面值抵扣");
    }
}
