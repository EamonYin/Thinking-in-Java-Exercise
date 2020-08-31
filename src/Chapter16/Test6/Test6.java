package Chapter16.Test6;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/30,17:26
 * @version:1.0
 */
public class Test6 {
    static BerylliumSphere[][] fill(int xLen, int yLen) {
        BerylliumSphere[][] a = new BerylliumSphere[xLen][yLen];
        for (int i = 0; i < xLen; i++)
            for (int j = 0; j < yLen; j++)
                a[i][j] = new BerylliumSphere();
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fill(3, 3)));
    }
}
