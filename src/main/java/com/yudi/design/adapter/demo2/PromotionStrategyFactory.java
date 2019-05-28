package com.yudi.design.adapter.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName :PromotionStrategyFactory
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 15:08
 * @Version :1.0
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> map = new HashMap<>();

    static {
        map.put(PromotionKey.COUPON, new CouponStrategy());
        map.put(PromotionKey.CASHBACK, new CashbackStrategy());
        map.put(PromotionKey.GROUPBUY, new GroupbuyStrategy());
    }

    private static PromotionStrategyFactory promotionStrategyFactory;
    private static final EmptyStrategy EMPTY_STRATEGY = new EmptyStrategy();

    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = map.get(promotionKey);
        return map == null ? EMPTY_STRATEGY : promotionStrategy;
    }

    private interface PromotionKey {
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUPBUY = "GROUPBUY";
    }


}
