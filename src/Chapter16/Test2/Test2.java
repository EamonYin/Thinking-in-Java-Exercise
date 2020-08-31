package Chapter16.Test2;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/30,15:09
 * @version:1.0
 */
public class Test2 {
    static BerylliumSphere[] createArray(int size) {
        BerylliumSphere[] a = new BerylliumSphere[size];
        for(int i = 0; i < size; i++)
            a[i] = new BerylliumSphere();
        return a;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createArray(10)));
    }
}
