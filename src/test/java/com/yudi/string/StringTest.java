package com.yudi.string;

import org.junit.Test;

import java.util.HashSet;

/**
 * @Description :
 * @params $params$
 * @Return : $return$
 * @Author : $user$
 * @Date : $date$ $time$
 */
public class StringTest {
    /**
     * 1.字符串常量池（String Pool）保存着所有字符串字面量（literal strings），这些字面量在编译时期就确定。
     * 不仅如此，还可以使用 String 的 intern()方法在运行过程中将字符串添加到 String Pool 中。
     *
     * 2.当一个字符串调用 intern() 方法时，如果 String Pool 中已经存在一个字符串和该字符串值相等（使用 equals() 方法进行确定），
     * 那么就会返回 String Pool 中字符串的引用；否则，就会在 String Pool 中添加一个新的字符串，并返回这个新字符串的引用。
     *
     * 3.在 Java 7 之前，String Pool 被放在运行时常量池中，它属于永久代。而在 Java 7，String Pool 被移到堆中。
     * 这是因为永久代的空间有限，在大量使用字符串的场景下会导致 OutOfMemoryError 错误。
     *
     *
     * 4.new String("abc")
     * 使用这种方式一共会创建两个字符串对象（前提是 String Pool 中还没有 "abc" 字符串对象）。
     *
     * "abc" 属于字符串字面量，因此编译时期会在 String Pool 中创建一个字符串对象，指向这个 "abc" 字符串字面量；
     * 而使用 new 的方式会在堆中创建一个字符串对象。
     *
     */
    @Test
    public void test1(){
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1 == s2);           // false
        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3 == s4);
    }
    @Test
    public void test2(){
        String a = null;

        System.out.println(a.equals(null));
        HashSet hashSet = new HashSet();
        hashSet.add(a);
    }
    @Test
    public void test3(){
        final int a = 1;
        final StringTest stringTest = new StringTest();
    }


}
