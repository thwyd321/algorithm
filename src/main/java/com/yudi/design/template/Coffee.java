package com.yudi.design.template;

/**
 * @ClassName :Coffee
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:38
 * @Version :1.0
 */
public class Coffee extends CaffeineBeverageTemplate {
    @Override
    void brew() {
        System.out.println("磨咖啡");
    }

    @Override
    void addSomeThing() {
        System.out.println("加入牛奶和白糖");
    }
}
