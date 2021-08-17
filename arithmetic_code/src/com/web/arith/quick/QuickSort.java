package com.web.arith.quick;

public class QuickSort {
    public static void quickSort(int[] arr,int start,int end){
        if (start<end){
            int index=getIndex(arr,start,end);
            quickSort(arr,start,index-1);
            quickSort(arr,index+1,end);
        }
    }

    private static int getIndex(int[] arr,int start,int end) {
        int i=start;
        int j=end;
        int base=arr[i];
        if (i<j){
            while (i<j && arr[j]>=base){
                j--;
            }
            if (i<j){
                arr[i]=arr[j];
                i++;
            }
            while (i<j && arr[i]<base){
                i++;
            }
            if (i<j){
                arr[j]=arr[i];
                j--;
            }
        }
        arr[i]=base;
        return i;
    }
}
