package com.yudi.design.adapter.demo2;

/**
 * @ClassName :EmptyStrategy
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 14:51
 * @Version :1.0
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
