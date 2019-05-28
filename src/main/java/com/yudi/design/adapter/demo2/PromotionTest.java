package com.yudi.design.adapter.demo2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName :PromotionTest
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 15:30
 * @Version :1.0
 */
public class PromotionTest {

    public static void main(String[] args) {
        String promotionKey = "GROUPBUY";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.excute();


    }

}
