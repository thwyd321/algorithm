package com.yudi.design.prototype.demo2;

import java.io.Serializable;

/**
 * @ClassName :JinGuBang
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/23 11:28
 * @Version :1.0
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;
    public void big() {
        this.d *= 2;
        this.h *= 2;
    }
    public void small() {
        this.d /= 2;
        this.h /= 2;
    }
}
