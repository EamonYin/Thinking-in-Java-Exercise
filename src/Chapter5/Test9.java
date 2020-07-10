package Chapter5;

/**
 * @author:YiMing
 * @create:2020/7/5,19:33
 * @version:1.0
 */
public class Test9 {
    String s = "haha";
    public Test9(String s) {
        this(12);
        this.s = s;
        System.out.println("[String] constructor "+s);
    }

    public Test9(int s) {
        System.out.println("[int] constructor "+s);
    }

    public static void main(String[] args) {
        Test9 test9 = new Test9("dada");
    }
}
