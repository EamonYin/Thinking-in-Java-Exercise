package Chapter10.Test5;

/**
 * @author:YiMing
 * @create:2020/7/29,22:12
 * @version:1.0
 */
public class Test5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
