package com.web.arith.bubble;

import java.util.Arrays;

public class ApplicationBubble {
    public static void main(String[] args){
        int[] arr={5,8,423,3,87,7,95};
        int[] arry=BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arry));
    }
}
