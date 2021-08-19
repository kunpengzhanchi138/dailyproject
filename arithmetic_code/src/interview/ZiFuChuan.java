package interview;

public class ZiFuChuan {

    //字符串逆序
    /*
            String str=ZiFuChuan.nixuZiFuChuan("i am liuyunpeng");
            System.out.println(str);
     */
    public static String nixuZiFuChuan(String s){
        StringBuilder stringBuilder=new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }





}
