package Chapter16.Test14;

import net.mindview.util.CountingGenerator;
import java.util.Arrays;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/31,16:29
 * @version:1.0
 */
public class Test14 {
    public static void main(String[] args) {
        int size = 6;
        // First create all primitive arrays
        boolean[] a1 = new boolean[size];
        byte[] a2 = new byte[size];
        char[] a3 = new char[size];
        short[] a4 = new short[size];
        int[] a5 = new int[size];
        long[] a6 = new long[size];
        float[] a7 = new float[size];
        double[] a8 = new double[size];
        // Now fill them using a matching generator
        Fill.primitive(a1, new CountingGenerator.Boolean());
        print("a1 = " + Arrays.toString(a1));
        Fill.primitive(a2, new CountingGenerator.Byte());
        print("a2 = " + Arrays.toString(a2));
        Fill.primitive(a3, new CountingGenerator.Character());
        print("a3 = " + Arrays.toString(a3));
        Fill.primitive(a4, new CountingGenerator.Short());
        print("a4 = " + Arrays.toString(a4));
        Fill.primitive(a5, new CountingGenerator.Integer());
        print("a5 = " + Arrays.toString(a5));
        Fill.primitive(a6, new CountingGenerator.Long());
        print("a6 = " + Arrays.toString(a6));
        Fill.primitive(a7, new CountingGenerator.Float());
        print("a7 = " + Arrays.toString(a7));
        Fill.primitive(a8, new CountingGenerator.Double());
        print("a8 = " + Arrays.toString(a8));
    }
}
