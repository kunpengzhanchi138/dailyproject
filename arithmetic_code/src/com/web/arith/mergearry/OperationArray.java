package com.web.arith.mergearry;


/*
数组相关排序类
 */
public class OperationArray {
    /*
    两个有序数组合并为一个有序数组
    1、定义个一个数组长度为两个长度之和
    2、将两个数组的元素进行对比，将小的插入新数组
    3、对比结束后将剩余数组拼接在后面
     */
    public static int[] mergeTwozOrderedArray(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] arr=new int[arr1.length + arr2.length];
        while (i<arr1.length && j<arr2.length){
            if (arr1[i] < arr2[j]){
                arr[k++]=arr1[i++];
            }
            else {
                arr[k++]=arr2[j++];
            }
        }
        while (i<arr1.length){
            arr[k++]=arr1[i++];
        }
        while (j<arr2.length){
            arr[k++]=arr2[j++];
        }
        return arr;
    }
}
