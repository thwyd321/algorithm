package com.yudi.algorithm.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description :面试题
 * @Author : wangyudi
 * @Date : 2019/4/10 10:44
 */
public class Interview {
    /**
     * 给定两个数组查交集,已排序
     */
    @Test
    public void test1() {
        int [] nums1 = {1,2,3,5,8,9,9,9,10};
        int [] nums2 = {1,2,3,5,8,9,9,9,10};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList();
        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] arrs = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arrs[i] = list.get(i);
            System.out.println(arrs[i]);
        }
    }
}


