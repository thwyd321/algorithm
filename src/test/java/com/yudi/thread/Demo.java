package com.yudi.thread;

import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName :Demo
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 14:19
 * @Version :1.0
 */
public class Demo{
    private static int count=0;
    public static void inc(){
       /* try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(count);
        count++;
    }
    public static void main(String[] args)
            throws InterruptedException {
        for(int i=0;i<1000;i++){
            new Thread(()->Demo.inc()).start();
        }
        Collections.newSetFromMap(new ConcurrentHashMap<>());
        //Thread.sleep(3000);
        System.out.println("运行结果"+count);
    }
}