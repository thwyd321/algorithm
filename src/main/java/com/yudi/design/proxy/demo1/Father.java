package com.yudi.design.proxy.demo1;

/**
 * @ClassName :Father
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 16:57
 * @Version :1.0
 */
public class Father implements Person {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    @Override
    public void findLove() {
        System.out.println("父母物色对象");
        this.son.findLove();
        System.out.println("双方同意交往，确立关系");

    }
}
