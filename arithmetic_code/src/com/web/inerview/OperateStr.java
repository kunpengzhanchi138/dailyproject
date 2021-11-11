package com.web.inerview;

public class OperateStr {
    //字符串反转
    public static void reverseStr(String str){
        char[] chars = str.toCharArray();
        String s="";
        for (int i=chars.length-1;i>=0;i--){
            s=s+chars[i];
        }
        System.out.println(s);
        }

    public static void reverseStr1(String str){
       StringBuilder stringBuilder=new StringBuilder(str);
       String s=stringBuilder.reverse().toString();
        System.out.println(s);
    }

}

