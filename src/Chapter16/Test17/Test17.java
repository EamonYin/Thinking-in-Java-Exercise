package Chapter16.Test17;


import java.math.*;
import java.util.*;
import net.mindview.util.*;

/**
 * @author:YiMing
 * @create:2020/8/31,16:43
 * @version:1.0
 */
public class Test17 {
    public static void main(String[] args) {
        BigDecimal[] a = {new BigDecimal(9), new BigDecimal(8), new BigDecimal(7), new BigDecimal(6)};
        System.out.println(Arrays.toString(a));

        a = Generated.array(a, new BigDecimalGenerator(new BigDecimal("0.1")));
        System.out.println(Arrays.toString(a));

        BigDecimal[] b = Generated.array(BigDecimal.class, new BigDecimalGenerator(new BigDecimal("0.2")), 15);
        System.out.println(Arrays.toString(b));
    }
}
