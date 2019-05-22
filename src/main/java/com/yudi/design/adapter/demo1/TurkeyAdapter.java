package com.yudi.design.adapter.demo1;

/**
 * @ClassName :TurkeyAdapter
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/13 15:10
 * @Version :1.0
 */
public class TurkeyAdapter implements IDuck {
    private ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        if (turkey != null) {
            turkey.gobble();
        }
    }


}
