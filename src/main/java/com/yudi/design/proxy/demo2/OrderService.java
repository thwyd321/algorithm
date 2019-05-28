package com.yudi.design.proxy.demo2;

/**
 * @ClassName :OrderService
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 17:04
 * @Version :1.0
 */
public class OrderService implements IOrderService {
    private OrderDao orderDao;

    public OrderService() { //如果使用 Spring 应该是自动注入的 //我们为了使用方便，在构造方法中将 orderDao 直接初始化了
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }

}
