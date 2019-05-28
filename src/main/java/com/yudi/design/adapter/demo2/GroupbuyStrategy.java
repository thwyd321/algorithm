package com.yudi.design.adapter.demo2;

/**
 * @ClassName :GroupbuyStrategy
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 14:48
 * @Version :1.0
 */
public class GroupbuyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("拼团，满 20 人成团，全团享受团购价");
    }
}
