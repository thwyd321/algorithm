package com.yudi.design.template;

/**
 * @ClassName :Client
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 14:42
 * @Version :1.0
 */
public class Client {
    public static void main(String[] args) {

        CaffeineBeverageTemplate caffeineBeverageTemplate1 = new Coffee();
        CaffeineBeverageTemplate caffeineBeverageTemplate2 = new Tea();

        caffeineBeverageTemplate1.makeCaffeineBeverage();
        System.out.println("--------------");
        caffeineBeverageTemplate2.makeCaffeineBeverage();

    }
}
