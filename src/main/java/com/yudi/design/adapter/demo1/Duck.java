package com.yudi.design.adapter.demo1;

/**
 * @ClassName :Duck
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 15:09
 * @Version :1.0
 */
public class Duck implements IDuck {
    @Override
    public void quack() {
        System.out.println("鸭子叫");
    }
}
