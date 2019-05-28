package com.yudi.design.proxy.demo2;

/**
 * @ClassName :OrderDao
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 17:03
 * @Version :1.0
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao 创建 Order 成功!");
        return 1;
    }
}
