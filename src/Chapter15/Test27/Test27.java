package Chapter15.Test27;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/25,21:29
 * @version:1.0
 */
public class Test27 {
    public static void main(String[] args) {
        List<Number> ints1 = new ArrayList<>();
        List<? extends Number> ints2 = new ArrayList<>();

        ints1.add(new Integer(1));
        ints1.add(new Float(1.0));
//        ints1.add(new Object());
        ints1.add(null);
        for (int i = 0; i < ints1.size(); i++) {
            System.out.println(ints1.get(0));
        }

        System.out.println("-------------协变无效--------------");

//        ints2.add(new Integer(1));
//        ints2.add(new Float(1.0));
//        ints2.add(new Object());
        ints2.add(null);
        for (int i = 0; i < ints1.size(); i++) {
            System.out.println(ints2.get(0));
        }
    }
}
