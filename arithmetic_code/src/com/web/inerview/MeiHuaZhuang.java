package com.web.inerview;

/*
        int[] arrx={2,5,1,5,4,5};
        int x=MeiHuaZhuang.meiHuaZhuang(arrx,1);
        System.out.println(x);
 */
public class MeiHuaZhuang {
    public static int meiHuaZhuang(int[] arr,int a){
        int step=0;
        for (int i=a;i<arr.length;i++){
            if (arr[i]>arr[a-1]){
                step=step+1;
            }
        }
        return step;
    }
}
