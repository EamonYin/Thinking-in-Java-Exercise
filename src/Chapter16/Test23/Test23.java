package Chapter16.Test23;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author:YiMing
 * @create:2020/8/31,21:28
 * @version:1.0
 */
public class Test23 {
    public static void main(String[] args) {
        Integer[] integers = new Integer[5];
        Generated.array(integers,new RandomGenerator.Integer(100));
        Arrays.sort(integers, Collections.reverseOrder());
        System.out.println(Arrays.toString(integers));
    }
}
