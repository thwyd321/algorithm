package com.yudi.design.delegate.demo1;

/**
 * @ClassName :EmpoyeeB
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 10:18
 * @Version :1.0
 */
public class EmpoyeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工 B，我现在开始干" + command + "工作");
    }
}
