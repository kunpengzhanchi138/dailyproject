package com.web.arith;

import com.web.arith.bubble.BubbleSort;
import com.web.arith.quick.QuickSort;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        //冒泡排序
//        int[] arr={5,8,423,3,87,7,95};
//        int[] arry= BubbleSort.bubbleSort(arr);
//        System.out.println(Arrays.toString(arry));


        //快排
        int[] arr={5,8,423,3,87,7,95};
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
