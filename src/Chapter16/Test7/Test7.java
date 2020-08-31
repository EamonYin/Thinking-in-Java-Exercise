package Chapter16.Test7;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/30,17:26
 * @version:1.0
 */
public class Test7 {
    static BerylliumSphere[][][] fill(int xLen, int yLen, int zLen) {
        BerylliumSphere[][][] a = new BerylliumSphere[xLen][yLen][zLen];
        for (int i = 0; i < xLen; i++)
            for (int j = 0; j < yLen; j++)
                for (int z = 0; z < a[i][j].length; z++)
                    a[i][j][z] = new BerylliumSphere();
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(fill(3, 3, 10)));
    }
}
