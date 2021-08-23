package com.web.inerview;



/*
1 1 2 3 5 8 13，求第n个数----下一个数等于前两个数之和
我们可以用递归，调用方法自己 第n个数=第n-1个数+第n-2个数
如果n=1或n=2，则这个数是1
 */
public class DiNGeShu {
    public static int diNGeShu(int n){
        if (n==1||n==2){
            return 1;
        }
        else {
            return diNGeShu(n-1)+diNGeShu(n-2);
        }
    }



    public static void diNGeShu1(int z){
        int first=1,second=1,next;
        for(int i=3;i<=z;i++) {
            next=first+second;
            System.out.println(next);
            first=second;
            second=next;
            }
    }
}


