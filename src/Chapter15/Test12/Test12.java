package Chapter15.Test12;

import java.util.Arrays;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/23,15:44
 * @version:1.0
 */
public class Test12 {
    static void f(List<List<String>> list1){}
    public static void main(String[] args) {
        New aNew = new New();

        List<List<String>> list = aNew.list();
        list.add(Arrays.asList("a1","a2","a3"));
        list.add(Arrays.asList("b1","b2","b3","b4"));
        System.out.println(list);

        f(aNew.<List<String>>list());

    }
}
