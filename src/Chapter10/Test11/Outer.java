package Chapter10.Test11;

/**
 * @author:YiMing
 * @create:2020/7/30,21:26
 * @version:1.0
 */
public class Outer {
    private class Inner implements SimpleInterface {
        public void f() {
            System.out.println("Outer5.Inner.f");
        }
    }
    public Inner get2() { return new Inner(); }
    public SimpleInterface get() { return new Inner(); }
}
