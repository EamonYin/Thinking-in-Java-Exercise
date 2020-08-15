package Chapter13.Test9;

/**
 * @author:YiMing
 * @create:2020/8/15,21:29
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {
        String s = "I Love You.";
        //替换元音字母为“_”
        String s1 = s.replaceAll("(?i)[aeiou]", "_");
        System.out.println(s1);
    }
}
