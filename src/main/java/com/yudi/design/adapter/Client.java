package com.yudi.design.adapter;

/**
 * @ClassName :Client
 * @Description :
 * 适配器模式
 * @Author : wangyudi
 * @Date : 2019/5/13 15:10
 * @Version :1.0
 */
public class Client {

    public static void main(String[] args) {
        ITurkey turkey = new Turkey();
        //叫火鸡叫的方法 适配为 鸭子叫的 quack方法。在调用quack时实际上还是调用了火鸡方法。
        IDuck duck1 = new TurkeyAdapter(turkey);
        duck1.quack();

        IDuck duck2 = new Duck();
        duck2.quack();


    }
}
