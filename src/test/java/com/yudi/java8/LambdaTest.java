package com.yudi.java8;

import org.junit.Test;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @ClassName :LambdaTest
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/16 17:11
 * @Version :1.0
 */
interface A {
    public int dd();
}
interface Converter<F, T>{
    T convert(F from);
}
class Something{
    String startWith(String s){
        return String.valueOf(s.charAt(0));
    }
}
class Person {
    String firstName;
    String lastName;
    int age;
    Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class LambdaTest {
    @Test
    public void test1(){
        List<Integer> integers = Arrays.asList(8, 4, 3, 1, 76, 44);
        Collections.sort(integers, Integer::compareTo);
        System.out.println(integers.toString());
    }
    @Test
    public void test2(){
        Converter<String,Integer> converter = from -> Integer.valueOf(from);
        Converter<String,Integer> converter2 = Integer::valueOf;
        Integer convert = converter.convert("123");
        Integer convert2 = converter2.convert("1234");
        System.out.println(convert);
        System.out.println(convert2);
    }
    @Test
    public void test3(){
        Something something = new Something();
        Converter<String,String> converter = something::startWith;
        String convert = converter.convert("123123123");
        System.out.println(convert);
    }
    @Test
    public void testPredicate(){
        Predicate<String> predicate = (s)->s.length()>0;
        boolean test = predicate.test("123132");
        System.out.println(test);
        Predicate<String> predicateString = String::isEmpty;
        boolean test1 = predicateString.test("12312");
        boolean test2 = predicateString.test("");
        System.out.println(test1);
        System.out.println(test2);
    }
    @Test
    public void testFunction(){
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        String apply = backToString.apply("123");// "123"
        Integer apply1 = toInteger.apply("123");
    }
    @Test
    public void testSupplier(){
        Supplier<Person> personSupplier = Person::new;
        Person person = personSupplier.get();// new Person
    }
    @Test
    public void testOptionals(){
        Person person = new Person();
        person.firstName="2";
        String a = Optional.ofNullable(person).filter(person1 -> person.firstName.equals("1")).map(p->person.firstName).orElse("2222");
        int b = Optional.ofNullable(person).map(Person::getAge).orElse(0);
        System.out.println(a);
        System.out.println(b);
    }


}
