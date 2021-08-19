package interview;
/*
正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，设计一个算法，求输入A和B的最小公倍数。
输入描述:
输入两个正整数A和B。

输出描述:
输出A和B的最小公倍数。

示例1
输入
5 7
复制
35
        int x=Gongbeishu.zuiXiaoGongbeishu(7,63);
        System.out.println(x);

 */
public class Gongbeishu {
    public static int zuiXiaoGongbeishu(int a,int b){
        int max=a>b?a:b;
        for (int i=max;;i=i+max){
            if (i%a==0&&i%b==0){
                return i;
            }
        }
    }




    public static int gongYingshu (int a, int b){//计算最大公约数 - 辗转相除法

        //用a/b, 余数为r，如果余数为零，算法结束，a就是最大公因数，
        //否则，位置互换（a = b, b = r），然后继续，直到余数为020
        if (b == 0) {
            return a;
        }
        return gongYingshu(b, a%b);
    }
    /**
     * 最小公倍数等于两数相乘然后除以最大公约数
     */
    public static int gongBeiShu_2(int a, int b) {
        return (a * b) / gongYingshu(a, b);
    }




}
