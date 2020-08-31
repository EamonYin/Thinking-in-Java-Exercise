package Chapter16.Test3;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/30,16:49
 * @version:1.0
 */
public class B {
    public static void printArray(Double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                System.out.printf("%.2f ", array[i][j]);
        }
    }
    public static void printArrayB(Double[][] array) {
        System.out.println(Arrays.deepToString(array));
    }
}
