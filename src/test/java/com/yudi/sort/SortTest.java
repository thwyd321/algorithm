package com.yudi.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @ClassName :SortTest
 * @Description :
 * @Author : wangyudi
 * @Date : 2019/5/17 10:48
 * @Version :1.0
 */
public class SortTest {
    int[] arr = {3, 77, 32, 567, 8, 3434, 9};

    public void swap(int[] arr,int i,int min){
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;

    }
    /**
     * 选择排序
     * 从数组中选择最小元素，将它与数组的第一个元素交换位置。再从数组剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。
     * 不断进行这样的操作，直到将整个数组排序。
     * 选择排序需要 ~N2/2 次比较和 ~N 次交换，它的运行时间与输入无关，这个特点使得它对一个已经排序的数组也需要这么多的比较和交换操作。
     */
    @Test
    public void xuanze() {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr,i,minIndex);
        }
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 冒泡排序
     * 从左到右不断交换相邻逆序的元素，在一轮的循环之后，可以让未排序的最大元素上浮到右侧。
     * 在一轮循环中，如果没有发生交换，那么说明数组已经是有序的，此时可以直接退出。
     */
    @Test
    public void maopao(){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j+1]<arr[j]){
                    swap(arr,j,j+1);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
