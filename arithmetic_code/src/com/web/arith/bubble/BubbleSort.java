package com.web.arith.bubble;

public class BubbleSort {
    public static int[] bubbleSort(int[] arr){
        boolean flag=true;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag){
                break;
            }

        }
        return arr;
    }
}
