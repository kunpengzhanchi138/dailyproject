package interview;

import java.util.ArrayList;
/*在一个无序数组中，找出数组中的，最长递增子序列
[2,6,7, 3, 8, 10, 14, 19, 20, 28, 11, 19,17]

int[] arr={2,6,7, 3, 8, 10, 14, 19, 20, 28, 11, 19,17}
LianxuDizeng.wuxushuzu(arr);

 */


public class LianxuDizeng {

    public static void wuxushuzu(int[] arr){
        int count=0;
        ArrayList<Integer> l=new ArrayList<>();
        for (int s=0;s<arr.length-1;s++){
            for (int e=s+1;e<=arr.length-1;e++){
                ArrayList<Integer> list=new ArrayList<>();
                list.add(arr[s]);
                for (int i=s;i<e;i++){
                    if (arr[i+1]>arr[i]){
                        list.add(arr[i+1]);
                    }
                    else {
                        break;
                    }
                }
                if (l.size()<list.size()){
                    l=list;
                }
            }
        }
        System.out.println(l);
    }

}
