package com.yudi.algorithm.search;

import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/5 10:37
 */
public    class Search {

     Search(){

    }
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        String str = "We Are Happy";
        String replace = str.replace(" ", "1");
        System.out.println(replace);
        URL url = new URL("http://www.123.com");
        Integer a = new Integer(9);
        Integer b = new Integer(9);

        System.out.println(a.equals(b));
    }
    /**
     * 二分查找
     */
    @Test
    public void erFenSearch(){
        int a = 4;
        int [] arr = {1,2,3,4,5,8,9,100,103};
        int start=0;
        int end = arr.length-1;
        while (start<=end){
            int middle = (start + end)/2;
            if (a == arr[middle]){
                System.out.println(true);
                return;
            }
            if (a<arr[middle]){
                end = middle-1;
            }
            if (a>arr[middle]){
                start = middle+1;
            }
        }
        System.out.println(false);
    }
    /**
     * 斐波那契数列
     */
    @Test
    public void feibonaxie(){
        int a= 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<100;i++){
            int c = a+b;
            System.out.println(c);
            int temp = b;
            b = c;
            a = temp;
        }
    }
    /**
     * 斐波那契数列递归
     */
    @Test
    public void feibonaxieDigui(){
        int a = 9;
        System.out.println(feibonaxie1(a));

    }
    public long feibonaxie1(int n ){
        if (n<=0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return feibonaxie1(n-1)+feibonaxie1(n-2);


    }

}
