package Chapter5;

/**
 * @author:YiMing
 * @create:2020/7/9,19:39
 * @version:1.0
 */
public class Test14 {
    static String s1 = "s1";
    static String s2;
    static {s2 = "s2";}


    public static void main(String[] args) {
        Test14 test14 = new Test14();
        System.out.println(test14.s1+",  "+test14.s2);
    }

}
