package com.yudi.design.proxy.demo2;

/**
 * @ClassName :DynamicDataSourceEntry
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/27 17:07
 * @Version :1.0
 */
public class DynamicDataSourceEntry {
    // 默认数据源
    public final static String DEFAULT_SOURCE = null;
    private final static ThreadLocal<String> local = new ThreadLocal<String>();

    private DynamicDataSourceEntry() {
    }

    /**
     * 清 空 数 据 源
     */
    public static void clear() {
        local.remove();
    }

    /**
     * 获 取 当 前 正 在 使 用 的 数 据 源 名 字 * * @return String
     */
    public static String get() {
        return local.get();
    }

    /**
     * 还 原 当 前 切 面 的 数 据 源
     */
    public static void restore() {
        local.set(DEFAULT_SOURCE);
    }

    /**
     * 设 置 已 知 名 字 的 数 据 源 * * @param source
     */
    public static void set(String source) {
        local.set(source);
    }

    /**
     * 根 据 年 份 动 态 设 置 数 据 源 * @param year
     */
    public static void set(int year) {
        local.set("DB_" + year);
    }
}