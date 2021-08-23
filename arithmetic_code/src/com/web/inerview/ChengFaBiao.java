package com.web.inerview;

public class ChengFaBiao {
    public static void chengFaBiao(int z){
        for (int x=1;x<=z;x++){
            for (int y=1;y<=x;y++){
                System.out.print(y+"*"+x+"="+x*y);
                System.out.print(" ");
                if (y==x){
                    System.out.println();
                }
            }
        }
    }
}
