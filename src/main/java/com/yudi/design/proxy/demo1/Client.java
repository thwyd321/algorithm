package com.yudi.design.proxy.demo1;

/**
 * @ClassName :Client
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 16:59
 * @Version :1.0
 */
public class Client {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();

    }

}
