package Chapter11.Test7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/4,20:42
 * @version:1.0
 */
public class Test7 {
    public static void main(String[] args) {
        Empty[] empties = {new Empty(5),new Empty(6),new Empty(7),new Empty(8),new Empty(9)};
        ArrayList<Empty> la = new ArrayList<>(Arrays.asList(empties));
        System.out.println("集合"+la);
        List<Empty> empties1 = la.subList(1, 4);
        System.out.println("子集"+empties1);
        la.removeAll(empties1);
        System.out.println("新"+la);
    }
}
