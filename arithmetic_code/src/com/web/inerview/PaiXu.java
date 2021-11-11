package com.web.inerview;

import java.util.Arrays;

public class PaiXu {
    /*
    将一个无须数组进行排序
    {67,35,65,23,5,6,8,2,61,33,23,}返回{2,5,6,8,23,33,35,61,65,67}
    采用快排算法：从数列中取出一个数做基准，比他大的放他左边，比他小的放他右边，然后把两边的
    数列继续按此方法排，直到数组中为一个原素，所以就是要找到基准索引，然后递归
    找基准索引（填坑法）--爱奇艺：
    定义三个变量：基准值（一般取第一个数），实际开始索引、实际结尾索引
    1、把第一个数拿出来作为基准，则arr[0]目前是第一个坑
    2、由后往前找比他小的数，找到后挖出此数填到第一个坑中
    3、由前往后找比他大或等于他的数，找到后挖出此数填到上一个坑中
    4、循环2和3，最后开始索引和结尾索引相遇，把第一个挖出的基准数填到此坑
     */
    public static int[] quickSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex<endIndex){
            int middleIndex = getMiddleIndex(arr, startIndex, endIndex);
            quickSort(arr, startIndex, middleIndex - 1);
            quickSort(arr, middleIndex + 1, endIndex);
        }
        return arr;
    }
    //抽取获取中间（不一定是物理意义的中间）索引方法
    private static int getMiddleIndex(int[] arr, int startIndex, int endIndex) {
        int actualStartIndex = startIndex;
        int actualEndIndex = endIndex;
        int baseElement = arr[startIndex];
        while (actualStartIndex < actualEndIndex) {  //从后往前找和从前往后找没有重合
            while (actualStartIndex < actualEndIndex && arr[actualEndIndex] >= baseElement) { //从后往前找，后面的数如果比基准数大就跳过
                actualEndIndex--;
            }
//            if (actualStartIndex < actualEndIndex) {  //直到后面这个数比基准数小，我们就要把后面这个数取出来，把基准数填进去
                arr[actualStartIndex] = arr[actualEndIndex];
//                actualStartIndex++;
//            }
            while (actualStartIndex < actualEndIndex && arr[actualStartIndex] < baseElement) {  //然后从前往后找，如果前面这个数比基准数小就跳过
                actualStartIndex++;
            }
//            if (actualStartIndex < actualEndIndex) {  //直到前面这个数比基准数大，我们就把这个数取出来，放到上一个从后往前找的位置
                arr[actualEndIndex] = arr[actualStartIndex];
//                actualEndIndex--;
//            }
        }
        arr[actualEndIndex] = baseElement;  //上面循环完成后，前后相遇及s=e，我们把第一个取的基准数放到这个重合位置
        return actualEndIndex;              //然后把这个重合的索引返回
    }


    /*
    将一个数组的三种特征值分类排列
    [0,1,1,0,2,2],6   返回：[1,1,0,0,2,2]，
    采用三色排序
    1、定义三个指针：p0从起始位置开始,p1从末尾位置开始，i从起始位置开始
    2、如果i小于p1则需要一直循环,直到i与p1重合i<=p1
    3、如果arr[i]==0,则arr[i]与arr[p0]交换，且i和p0向后移动一位
    4、如果arr[i]==1,则i向后移动一位
    5、如果arr[i]==2，则arr[i]与arr[p1]交互，且p1向前移动一位
     */
    public static void sanse(int[] arr) {
        int p0=0;
        int p1=arr.length-1;
        int i=0;
        while (i<=p1){
            if (arr[i]==1){   //如果值为0，与起始位置互换，且i和起始位置p0向后移动一位
                swap(arr,i,p0);
                i++;
                p0++;
            }
            else if (arr[i]==2){ //如果值为2，与末尾值互换，且结束位置p0向前移动一位
                swap(arr,i,p1);
                p1--;
            }
            else {    //如果值为1，则i向后移动一位
                i=i+1;
            }
        }
        System.out.println(Arrays.toString(arr));  //将排序后的数组打印出来
    }
    //抽取值交换方法
    public static void swap ( int[] a, int i, int j){
        if (i != j) {        //此判断条件可以去掉
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}

