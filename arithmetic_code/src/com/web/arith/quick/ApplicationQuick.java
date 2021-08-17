package com.web.arith.quick;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ApplicationQuick {
    public static void main(String[] args) {
        int[] arr={5,8,423,3,87,7,95};
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
