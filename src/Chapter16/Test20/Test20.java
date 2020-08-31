package Chapter16.Test20;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/31,19:09
 * @version:1.0
 */
public class Test20 {
    public static void main(String[] args) {
        Integer[][] a = {{1,2},{1,2}};
        Integer[][] b = {{1,2},{1,125}};
        System.out.println(Arrays.deepEquals(a,b));
    }
}
