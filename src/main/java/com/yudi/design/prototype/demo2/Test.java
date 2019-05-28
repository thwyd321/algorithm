package com.yudi.design.prototype.demo2;

/**
 * @ClassName :Test
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/23 11:31
 * @Version :1.0
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        SunWuKong sunWuKong = new SunWuKong();

        SunWuKong s1 = (SunWuKong) sunWuKong.clone();
        System.out.println(s1.jinGuBang == sunWuKong.jinGuBang);

        SunWuKong sunWuKong1 = new SunWuKong();
        SunWuKong s2 = (SunWuKong) sunWuKong1.shallowClone();
        System.out.println(s2.jinGuBang == sunWuKong1.jinGuBang);


    }

}
