package com.web.inerview;
//将一个正整数拆解成连续正整数之和


public class ZhengShuChaiJie {
    //给定一个正整数 N，试求有多少组连续正整数满足所有数字之和为 N?
    public static void zhengShuChaiJie(int z){
        int count=0;
        for (int x=1;x<z;x++){
            for (int y=x+1;y<=z;y++){
                int sum=(y+x)*(y-x+1)/2;
                if (sum==z){
                    count=count+1;
                }
            }
        }
        System.out.println(count);
    }

    //将匹配组合输出
    public static void zhengShuChaiJie1(int z){
        for (int x=1;x<z;x++){
            for (int y=x+1;y<=z;y++){
                int sum=(y+x)*(y-x+1)/2;
                if (sum==z){
                    String s=z+"=";
                    for (int a=x;a<=y;a++){
                        if (a==x){
                            s=s+a;
                        }
                        else {
                            s=s+"+"+a;
                        }
                    }
                    System.out.println(s);
                }
            }
        }
    }
}
