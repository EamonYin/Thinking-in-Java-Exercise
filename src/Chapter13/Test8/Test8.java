package Chapter13.Test8;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/15,21:25
 * @version:1.0
 */
public class Test8 {
    public static void main(String[] args) {
        String str = "I Love You.";
        String[] split = str.split("Love|You");
        for (String s: split) {
            System.out.print(s);
        }
        System.out.println("-------------------------");
        System.out.println(Arrays.toString(split));
    }
}
