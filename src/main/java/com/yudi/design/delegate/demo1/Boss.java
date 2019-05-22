package com.yudi.design.delegate.demo1;

/**
 * @ClassName :Boss
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/22 10:31
 * @Version :1.0
 */
public class Boss {

    public void command(String command,Leader leader){
        leader.doing(command);
    }

}
