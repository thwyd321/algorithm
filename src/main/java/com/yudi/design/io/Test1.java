package com.yudi.design.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @ClassName :Test1
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 16:55
 * @Version :1.0
 */
public class Test1 {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("c://fdf");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

    }


}
