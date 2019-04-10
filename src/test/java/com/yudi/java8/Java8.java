package com.yudi.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Description :
 * @params $params$
 * @Return : $return$
 * @Author : $user$
 * @Date : $date$ $time$
 */
public class Java8 {

    @Test
    public void test1(){
        List<String> strings = Arrays.asList("8", "2", "3");
        strings.sort((a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(strings.toArray()));

    }
    public int getA(String a){
        return 1;
    }

    public void getB(String a){
        System.out.println(a);
    }

}
