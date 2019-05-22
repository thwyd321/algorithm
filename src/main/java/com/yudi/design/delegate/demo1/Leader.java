package com.yudi.design.delegate.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName :Leader
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 10:23
 * @Version :1.0
 */
public class Leader implements IEmployee {

    private Map<String,IEmployee> targets = new HashMap<>();

    public Leader() {
        targets.put("register",new EmployeeA());
        targets.put("login",new EmpoyeeB());
    }

    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
