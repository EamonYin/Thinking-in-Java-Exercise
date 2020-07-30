package Chapter10.Test6;

import Chapter10.Test6.One.One;
import Chapter10.Test6.Two.Two;

/**
 * @author:YiMing
 * @create:2020/7/30,18:21
 * @version:1.0
 */
public class Test6 extends Two {

    public One get() {
//        Two two = new Two();
//        ImpOneTest impOneTest = two.new ImpOneTest();
//        String s = impOneTest.OneTest();

        return new ImpOneTest();

    }

    public static void main(String[] args) {
        String s = new Test6().get().OneTest();
        System.out.println(s);
    }
}
