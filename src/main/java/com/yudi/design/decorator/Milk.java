package com.yudi.design.decorator;

/**
 * @ClassName :Milk
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 15:59
 * @Version :1.0
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1+this.beverage.cost();
    }
}
