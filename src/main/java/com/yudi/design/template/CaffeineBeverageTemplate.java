package com.yudi.design.template;

/**
 * @ClassName :CaffeineBeverageTemplate
 * @Description :
 * 咖啡因饮料制作模板（茶和咖啡）
 *
 * @Author : wangyudi
 * @Date : 2019/5/13 14:34
 * @Version :1.0
 */
public abstract class CaffeineBeverageTemplate {

    final void makeCaffeineBeverage(){
        boilWater();
        brew();
        pourInCup();
        addSomeThing();
    }

    void boilWater(){
        System.out.println("烧水");
    }
    //制作
    abstract void brew();

    void pourInCup(){
        System.out.println("倒在杯里");
    }

    //加配料
    abstract void addSomeThing();

}
