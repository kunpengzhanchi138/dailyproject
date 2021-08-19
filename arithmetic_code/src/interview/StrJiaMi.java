package interview;

import java.util.ArrayList;

public class StrJiaMi {
    /*
    最字符串加密，机密方式：每个字母str[i]偏移特定数组元素arr[i]的量，数组前三值已赋值arr[0]=1,arr[1]=2,arr[2]=4,当i>=3时，数组元素
    arr[i]=arr[n-1]+arr[n-2]+arr[n-3]
    如：输入abcde，输出bdgkr
            System.out.println(StrJiaMi.getStr("abcde"));

     */
    //对字符串进行偏移，不适宜用string.replace(string的值是不便的，每次产生新对象)
    public static String getStr(String s){
        ArrayList<Character> l=new ArrayList<>();
        for (int j=0;j<s.length();j++){
            int[] arr=getArr(s.length());
            l.add((char)(s.charAt(j)+arr[j]));
        }
        return l.toString();
    }

    //将下面的数组元素组成数组
    public static int[] getArr(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add(getSum(i));
        }
//        int[] arr= list.stream().mapToInt(Integer::intValue).toArray();  //将int的list转为int的数组
        //将list转换为数组，用list.list.toString()转换的数组为Object类型

        int[] arr=new int[list.size()];
        for (int h=0;h<list.size();h++){
            arr[h]=list.get(h);
        }
        return arr;
    }


    //用递归求数组元素arr[i]的值
    public static int getSum(int n){
        if (n==1){
            return 1;
        }
        else if (n==2){
            return 2;
        }
        else if(n==3){
            return 4;
        }
        else {
            return getSum(n-1)+getSum(n-2)+getSum(n-3);
        }
    }
}
