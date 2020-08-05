package Chapter11.Test2;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @author:YiMing
 * @create:2020/8/3,21:05
 * @version:1.0
 */
public class SimpleController {
    public static void main(String[] args) {
        Set<Integer> integers = new LinkedHashSet<Integer>();

        //Set不存重复元素
        integers.add(1);

        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        for (int i : integers) {
            System.out.print(i+" ");
        }
    }
}
