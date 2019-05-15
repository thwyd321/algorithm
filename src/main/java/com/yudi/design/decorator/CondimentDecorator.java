package com.yudi.design.decorator;

/**
 * @ClassName :CondimentDecorator
 * @Description :
 * 调味品装饰者
 * @Author : wangyudi
 * @Date : 2019/5/13 15:58
 * @Version :1.0
 */
public abstract class CondimentDecorator implements Beverage{
    protected Beverage beverage;
}
