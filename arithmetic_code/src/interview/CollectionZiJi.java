package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
1、假设n为集合元素个数，则有1>>n(2的n次方)个子集
2、假设i代表第几个数，则这个数就是i的二进制和元集合元素匹配，0为不屈不取此位元素，1为取此位元素
        int[] arr ={ 1, 2 ,3};
        System.out.println(CollectionZiJi.getSubSet(set));
 */
public class CollectionZiJi {
    public static Set<Set<Integer>> getSubSet(int[] arr) {
        Set<Set<Integer>> result = new HashSet<Set<Integer>>(); // 用来存放子集的集合，如{{},{1},{2},{1,2}}
        List<Integer> l=new ArrayList<>();
        int length = arr.length;
        int num = length == 0 ? 0 : 1 << (length); // 2的n次方，若集合set为空，num为0；若集合set有4个元素，那么num为16.

        // 从0到2^n-1（[00...00]到[11...11]，这层for控制子集合个数
        for (int i = 0; i < num; i++) {
            Set<Integer> subSet = new HashSet<Integer>();
            int index = i;
            //这层for循环组成每个子集
            for (int j = 0; j < length; j++) {
                if ((index & 1) == 1) { // 每次判断index最低位是否为1，为1则把集合set的第j个元素放到子集中
                    subSet.add(arr[j]);
                }
                index >>= 1; // 右移一位：每次判断后将位置移动一位
            }
            result.add(subSet); // 把子集存储起来
        }
        return result;
    }





   /*
        int[] arrx={1,1,3};
        System.out.println(CollectionZiJi.jihe(arrx));
    */
    public static Set<List> jihe(int[] arr){
        int total=1<<arr.length;
        System.out.println(total);
        int len=arr.length;
        System.out.println(len);

        Set<List> set=new HashSet<>();
        for (int i=0;i<=total;i++){
            ArrayList<Integer> list=new ArrayList();
            int index=i;
            for (int j=0;j<len;j++){
                if ((index&1)==1){
                    list.add(arr[j]);
                }
                index>>=1;
            }
            set.add(list);
        }
        return set;
    }
}
