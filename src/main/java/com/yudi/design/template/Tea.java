package com.yudi.design.template;

/**
 * @ClassName :Tea
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:40
 * @Version :1.0
 */
public class Tea extends CaffeineBeverageTemplate {
    @Override
    void brew() {
        System.out.println("摘茶叶");
    }

    @Override
    void addSomeThing() {
        System.out.println("加柠檬");
    }
}
