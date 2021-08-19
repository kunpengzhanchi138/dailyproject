package interview;

import java.util.Scanner;

//十进制转换为任意进制
public class JinzhiZhuanhuan {
    public static void jinzhiZhuanhuan(int z){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入整数：");
        int num = input.nextInt();
        String a = "";//用字符串拼接
        while(num!=0) {//利用十进制转二进制除2法
            a=num%z+a;
            num=num/z;
            System.out.println(num);
        }
            System.out.println(a);
    }
}
