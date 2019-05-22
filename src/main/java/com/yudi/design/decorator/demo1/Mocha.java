package com.yudi.design.decorator.demo1;

/**
 * @ClassName :Mocha
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 16:04
 * @Version :1.0
 */
public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return 1+this.beverage.cost();
    }
}
