package com.yudi.design.prototype.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName :test
 * @Description :
 * 浅克隆，对象中的引用类型克隆后还是同一个
 *
 * @Author : wangyudi
 * @Date : 2019/5/23 10:59
 * @Version :1.0
 */
public class QianClone {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        A a = new A();
        a.setAge(1);
        a.setName("wangyudi");
        a.setHobbies(list);
        A a1 = (A) a.clone();
        System.out.println(a == a1);
        System.out.println(a);
        System.out.println(a.getHobbies() == a1.getHobbies());
        System.out.println(a1.getHobbies().toString());
        System.out.println(a1.getAge());
        list.add(2);
        a.setAge(222);
        System.out.println(a1.getHobbies().toString());
        System.out.println(a1.getAge());
    }


    static class A implements Prototype{
        private String name;
        private int age;
        private List hobbies;
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List getHobbies() {
            return hobbies;
        }

        public void setHobbies(List hobbies) {
            this.hobbies = hobbies;
        }

        @Override
        public Prototype clone() {
            A a = new A();
            a.setName(this.name);
            a.setAge(this.age);
            a.setHobbies(this.getHobbies());
            return a;
        }
    }
    private interface Prototype{
        Prototype clone();
    }


}
