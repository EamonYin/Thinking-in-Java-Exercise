package Chapter10.Test26;

/**
 * @author:YiMing
 * @create:2020/8/2,18:12
 * @version:1.0
 */
public class Test26 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer2 outer2 = new Outer2();
        Outer2.Inner2 inner2 = outer2.new Inner2(outer, "Inner2");

    }
}
