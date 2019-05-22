package com.yudi.design.delegate.demo1;

/**
 * @ClassName :DelegateTest
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 10:32
 * @Version :1.0
 */
public class DelegateTest {

    public static void main(String[] args) {
        new Boss().command("login",new Leader());
    }

}
