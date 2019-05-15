package com.yudi.design.decorator;

/**
 * @ClassName :Coffee
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 15:56
 * @Version :1.0
 */
public class Coffee implements Beverage {
    @Override
    public double cost() {
        return 1;
    }
}
