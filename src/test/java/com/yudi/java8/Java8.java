package com.yudi.java8;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description :
 * @params $params$
 * @Return : $return$
 * @Author : $user$
 * @Date : $date$ $time$
 */
class Student{
    private String name;
    private int age;
    private int num;

    public Student(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Java8 {

    @Test
    public void test4(){
        Map<String,String> map1 = new HashMap<>();
        map1.put("1","a");
        map1.put("2","b");
        map1.put("3","c");
        map1.put("4","d");
        map1.put("5","e");
    }
    @Test
    public void test3(){
        List<String> list = Arrays.asList("8", "2", "3","4");
        List<String> collect = list.stream().filter(a -> (!"2".equals(a))).collect(Collectors.toList());
        System.out.println(collect);
        Student student1 = new Student("wangyudi",1,1);
        Student student2 = new Student("wangyudi2",2,1);
        Student student3 = new Student("wangyudi3",3,1);
        List<Student> list1 = new ArrayList();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.parallelStream().filter(s -> s.getAge() != 1).collect(Collectors.toList()).forEach(student -> System.out.println(student.getAge()));
        List<Integer> collect1 = list1.parallelStream().map(student -> student.getAge()).collect(Collectors.toList())   ;
        boolean wang = list1.stream().noneMatch(student -> student.getName().startsWith("wang"));//
        int sum = list1.stream().mapToInt(s -> s.getAge()).sum();//计算所有age的和
        Optional<String> reduce = list.stream().reduce((s1, s2) -> s1 +"#"+ s2);//集合中每个元素相加
        List<Student> collect2 = list1.stream().peek(a -> a.setAge(10)).collect(Collectors.toList());//peek 与map peek没有返回值
        collect2.forEach(a-> System.out.println(a.getAge()));
    }
    @Test
    public void test1(){
        List<String> list = Arrays.asList("8", "2", "3");
        list.sort((a,b)->b.compareTo(a));
        System.out.println(Arrays.toString(list.toArray()));

    }

    @Test
    public void test2(){

        String separator = ",";
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator ) );


        final int separator2 = 1;
        Arrays.asList( "a", "b", "d" ).forEach(
                ( String e ) -> System.out.print( e + separator2 ) );
    }

    @Test
    public void testStream(){

    }



    public int getA(String a){
        return 1;
    }

    public void getB(String a){
        System.out.println(a);
    }

}
