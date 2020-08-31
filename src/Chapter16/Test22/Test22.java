package Chapter16.Test22;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/31,21:19
 * @version:1.0
 */
public class Test22 {
    public static void main(String[] args) {
        Integer[] a = {1,3,4,7,6,8};
        //未排序
        int i = Arrays.binarySearch(a, 7);
        System.out.println("未排序a查找："+i);
        //排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        int j = Arrays.binarySearch(a, 7);
        System.out.println("排序后a查找："+j);
        //数组中没有
        int k = Arrays.binarySearch(a, 5);
        System.out.println("数字5应该插入："+k);


    }
}
