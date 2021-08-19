package interview;

/*
给定一个包含字母和数字的字符串，取出里面连续的数字作为一个大的整数，然后输入所有整数相加的值。
输入示例:
abc123de45fg67hijk8
输出示例:
243

备注:
123+45+67+8=243
 */
//String s="sj4dkj84fkd7474hh";
//        strIntSum(s);
public class StrIntSum {
    public static void strIntSum(String s){
        for (int x = 0; x < s.length(); x++) {
            if (!Character.isDigit(s.charAt(x))) {
                s=s.replace(s.charAt(x),' ');
            }
        }
        String[] arr=s.split(" ");
        int sum=0;
        for (int z=0;z<arr.length;z++){
            if (arr[z].length()!=0) {
                sum = sum + Integer.parseInt(arr[z]);
            }
        }
        System.out.println("sum="+sum);
    }
}
