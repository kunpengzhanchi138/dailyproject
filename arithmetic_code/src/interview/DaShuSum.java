package interview;

public class DaShuSum {
    public static void daShuSum(String str1,String  str2) {
        if (str1.length() < str2.length()) {
            str1=new StringBuilder(str1).reverse().toString();
            for (int i=str1.length();i<str2.length();i++){
                str1=str1+"0";
            }
            str1=new StringBuilder(str1).reverse().toString();
        }
        else {
            str2=new StringBuilder(str2).reverse().toString();
            for (int i=str2.length();i<str1.length();i++){
                str2=str2+"0";
            }
            str2=new StringBuilder(str2).reverse().toString();

        }
        StringBuilder sb = new StringBuilder();

        // 字符串都不为空时
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int idx1 = arr1.length - 1;
        int idx2 = arr2.length - 1;

        // 缓存是否需要进位
        boolean carry = false;
        // 遍历两个字符串 处理元素相加
        while (idx1>=0 && idx2 >=0) {
            char cur1 = arr1[idx1];
            char cur2 = arr2[idx2];
            // 相加
            int sum = cur1 - '0' + cur2 - '0';
            // 上一次运算是否有进位
            sum = carry ? sum+1: sum;
            // 是否需要进位
            carry = sum >= 10 ? true : false;
            // 相加结果 取个位数->字符类型
            sb.append((char)((sum%10) + '0'));
            // 索引递减
            idx1--;
            idx2--;
        }
        String str=sb.reverse().toString();
        System.out.println(str);
    }



    public static void dashuxiangjia(String s1,String s2){
        //两个大数相加
        if (s1.length() >s2.length()) {
            StringBuilder stringBuilder = new StringBuilder(s2);
            stringBuilder.reverse();
            for (int i = 0; i < (s1.length() - s2.length()); i++) {
                stringBuilder.append(0);
            }
            s2=stringBuilder.reverse().toString();
        }
        boolean b=false;
        StringBuilder stringBuilder=new StringBuilder();
        char[] chars1=s1.toCharArray();
        char[] chars2=s2.toCharArray();
        for (int i=chars1.length-1;i>=0;i--){
            int sum=chars1[i]-'0'+(chars2[i]-'0');
            sum=b?sum+1:sum;
            b=sum>=10?true:false;
            stringBuilder.append(sum%10);
        }
        String s=stringBuilder.reverse().toString();
        System.out.println(s);

    }



/*

        DaShuSum.dashu("120000988","4567");
 */

    public static void dashu(String s1,String s2){
        //s1的长度小于s2的长度
        if (s1.length()>s2.length()){
            String temp=s1;
            s2=s1;
            s1=temp;
        }
        //将s1与s2补位成相等位数
        StringBuilder stringBuilder=new StringBuilder(s1);
        stringBuilder.reverse();
        for (int i=1;i<=(s2.length()-s1.length());i++){
            stringBuilder.append(0);
        }
        s1=stringBuilder.reverse().toString();
        StringBuilder s=new StringBuilder();
        boolean b=false;
        for (int j=s1.length()-1;j>=0;j--){
            int sum=(s1.charAt(j)-'0')+(s2.charAt(j)-'0');
            sum=b?sum+1:sum;
            b=sum>=10?true:false;
            s.append(sum%10);
        }
        s.reverse();
        System.out.println(s);
    }
}

