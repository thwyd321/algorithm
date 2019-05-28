package com.yudi.design.adapter.demo2;

/**
 * @ClassName :PromotionActivity
 * @Description :
 * 促销活动入口类
 * @Author : wangyudi
 * @Date : 2019/5/22 14:53
 * @Version :1.0
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void excute() {
        promotionStrategy.doPromotion();
    }
}
