package Chapter16.Test4;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/30,17:14
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        A a = new A();
        Double[][][] doubles = a.MadeDoubleArray(2, 3, 3, 47.0, 47.01);
        System.out.println(Arrays.deepToString(doubles));
    }
}
