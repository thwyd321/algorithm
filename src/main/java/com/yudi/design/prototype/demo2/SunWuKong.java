package com.yudi.design.prototype.demo2;

import java.io.*;
import java.util.Date;

/**
 * @ClassName :SunWuKong
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/23 11:28
 * @Version :1.0
 */
public class SunWuKong extends Monkey implements Cloneable, Serializable {
    JinGuBang jinGuBang;

    public SunWuKong() {
        this.jinGuBang = new JinGuBang();
        this.birthday = new Date();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public Object deepClone() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            SunWuKong sunWuKong = (SunWuKong) objectInputStream.readObject();
            return sunWuKong;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public Object shallowClone() {
        SunWuKong sunWuKong = new SunWuKong();
        sunWuKong.jinGuBang = this.jinGuBang;
        sunWuKong.birthday = new Date();
        sunWuKong.height = this.height;
        sunWuKong.weight = this.weight;
        return sunWuKong;
    }

}
