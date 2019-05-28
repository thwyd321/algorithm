package com.yudi.thread;

/**
 * @ClassName :Test
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 11:52
 * @Version :1.0
 */
public class Test {
    public static int a = 0;

    public static void main(String[] args) {
        /*while (a<100){
            Thread thread = new Thread(() -> {
                    a++;
                    System.out.println(a);
            });
            thread.start();
        }
        System.out.println(a+"fdsdfasd");*/
        int a = (int) (Math.random() * 9 + 1);
        System.out.println(a);
    }
}
