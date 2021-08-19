package com.web.arith.mergearry;


import java.util.Arrays;

public class Applicationmergearry {
    public static void main(String[] args) {
        int[] arr1={1,42,5};
        int[] arr2={2,4,6,8};
        int arr[]=OperationArray.mergeTwozOrderedArray(arr1,arr2);
        System.out.println(Arrays.toString(arr));
    }
}
