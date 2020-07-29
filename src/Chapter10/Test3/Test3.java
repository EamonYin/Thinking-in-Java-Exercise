package Chapter10.Test3;

/**
 * @author:YiMing
 * @create:2020/7/29,20:02
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Outer outer = new Outer("This is Outer Constructor");
        Outer.Inner inner = outer.getInner();
        System.out.println(inner);
    }
}
