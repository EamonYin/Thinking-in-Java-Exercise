package Chapter16.Test12;

import net.mindview.util.Generated;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/31,15:58
 * @version:1.0
 */
public class Test12 {
    public static void main(String[] args) {
        double[] primitive = ConvertTo.primitive(Generated.array(Double.class, new CountingGenerator.Double(), 15));
        System.out.println(Arrays.toString(primitive));
    }
}
