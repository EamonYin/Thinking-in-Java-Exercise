package Chapter10.Test1;

/**
 * @author:YiMing
 * @create:2020/7/29,17:20
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.getInner(" Inner");
        System.out.println(inner);
    }
}
