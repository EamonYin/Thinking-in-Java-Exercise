package Chapter10.Test26;

/**
 * @author:YiMing
 * @create:2020/8/2,18:06
 * @version:1.0
 */
public class Outer2 {
    class Inner2 extends Outer.Inner {
        public Inner2(Outer outer, String str) {
            outer.super(str);
        }
    }
}
