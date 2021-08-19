package interview;

/*
找到字符串的最长无重复字符子串
        给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有字母都不相同)。
        输入描述
        输入包含两行，第一行包含一个整数n，代表数组arr的长度,第二行包含n个整数，代表数组arr。
        输出描述
        输出一个整数，代表arr的最长无重复字符的长度。
        示例1
        输入
        4
        2 3 4 5
        输出
        4
        示例2
        输入
        5
        2 2 3 4 3
        输出
        3
*/

import java.util.ArrayList;

public class NoRepetitionString {

    /*
    1、用嵌套循环把字符的所有组合列出来，一层循环是字符下表开始值，二层循环是末尾字符下标。如start=0对应end=1、2、3、4、str.length
       start=1对应end=2、3、4、str.length
    2、判断组合的字符串中是否包含他在给定字符串中的下一个字符，如果包含应把本字符串保留下来（因为他是目前最长不重复字段），然后把他的
       长度和以前按此规则截取的字符串长度做比较，存较长者
    3、如果字符串的末尾下标=给的字符串末尾下标，说明这个字符串一直到结束也没有重复，所以需要保存此字符串，并把长度和已存的字符串比较，
       存较长者
    4、打印最终保存的字符串长度
     */
    public static void noRepetitionString(String s) {
        String count = "";         //定义一个空字符串，用于接收每次比较的无重复最长字段
        for (int start = 0; start < s.length();start++) {   //控制组成字符的开始字符下标
            for (int end = start + 1; end <= s.length();end++) {  //控制组合字符串的末尾字符下标
                String str = "";
                str = s.substring(start, end);   //用String的substring方法截取字符串
                if (end == s.length()) {
                    if (count.length() < str.length()) {
                        count = str;
                    }
                    break;

                } else {
                    if (str.contains(s.substring(end,end + 1))) {
                        if (count.length() < str.length()) {
                            count = str;
                        }
                        break;
                    }
                }
            }
        }
        System.out.println(count.length());
    }

    //另一种思维
    public static void fun(String s){
        int newnum=0;
        int oldnum=0;
        if (s.length()==0){
            oldnum=0;
        }
        else if (s.length()==1){
            oldnum=1;
        }
        else {
            for (int i=0;i<s.length();i++){
                ArrayList<Character> list=new ArrayList<>();
                list.add(s.charAt(i));
                for (int j=i+1;j<s.length();j++){
                    if (!list.contains(s.charAt(j))){
                        list.add(s.charAt(j));
                        newnum=list.size();
                    }
                    else {
                        break;
                    }
                }
                if (oldnum<newnum){
                    oldnum=newnum;
                }
            }
            System.out.println(oldnum);
        }

    }
}