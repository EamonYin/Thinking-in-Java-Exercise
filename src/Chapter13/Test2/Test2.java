package Chapter13.Test2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/15,11:19
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        List<InfiniteRecursion> InfiniteRecursions = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
            InfiniteRecursions.add(new InfiniteRecursion());
        }
        System.out.println(InfiniteRecursions);
    }
}
