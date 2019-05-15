package com.yudi.design.adapter;

/**
 * @ClassName :Turkey
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 15:09
 * @Version :1.0
 */
public class Turkey implements ITurkey {
    @Override
    public void gobble() {
        System.out.println("火鸡叫");
    }
}
