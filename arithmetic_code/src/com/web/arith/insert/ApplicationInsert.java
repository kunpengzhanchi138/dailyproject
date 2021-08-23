package com.web.arith.insert;

import java.util.Arrays;

public class ApplicationInsert {
    public static void main(String[] args) {
        int[] arr={5,8,423,3,87,7,95};
        InsertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
