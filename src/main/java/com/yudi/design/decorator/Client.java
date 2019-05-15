package com.yudi.design.decorator;

/**
 * @ClassName :Client
 * @Description :
 * 装饰者模式
 * 为对象动态添加功能。
 *
 *
 * @Author : wangyudi
 * @Date : 2019/5/13 16:24
 * @Version :1.0
 */
public class Client {

    public static void main(String[] args) {

        Beverage beverage = new Coffee();
        Milk milk = new Milk(beverage);
        Mocha mocha = new Mocha(beverage);
        double cost = milk.cost();
        System.out.println(cost);

    }

}
