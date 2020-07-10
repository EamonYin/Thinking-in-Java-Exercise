package Chapter5.Test10;

/**
 * @author:YiMing
 * @create:2020/7/6,18:02
 * @version:1.0
 */
public class Test10 {

    public static void main(String[] args) throws Throwable {
        Test10 test10 = new Test10();
        test10.finalize();
        new Test10();
        System.gc();
    }
}
