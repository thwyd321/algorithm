package com.yudi.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Description :
 * @params $params$
 * @Return : $return$
 * @Author : $user$
 * @Date : $date$ $time$
 */

public class Mycache extends LinkedHashMap {
    private final int CACHE_SIZE;
    /**
     * LRU全称是Least Recently Used，即最近最久未使用的意思。
     *
     * LRU算法的设计原则是：如果一个数据在最近一段时间没有被访问到，
     * 那么在将来它被访问的可能性也很小。也就是说，当限定的空间已存满数据时，应当把最久没有被访问到的数据淘汰。
     */


    public Mycache(int cacheSize) {
        super((int) Math.ceil(cacheSize / 0.75) + 1, 0.75f, true);
        System.out.println((int) Math.ceil(cacheSize / 0.75) + 1);
        CACHE_SIZE = cacheSize;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
        return size() > CACHE_SIZE;
    }

    public static void main(String[] args) {
        Mycache mycache = new Mycache(10);
        for (int i=0;i<=20;i++){
            mycache.put(i,i);
        }

        mycache.forEach((k,v)->{
            System.out.println(k+","+v);
        });

    }
}
