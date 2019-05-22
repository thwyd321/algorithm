package com.yudi.design.delegate.demo1;

/**
 * @ClassName :EmployeeA
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 10:17
 * @Version :1.0
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工 A，我现在开始干" + command + "工作");
    }
}
