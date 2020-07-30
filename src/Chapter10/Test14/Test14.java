package Chapter10.Test14;

/**
 * @author:YiMing
 * @create:2020/7/30,22:40
 * @version:1.0
 */
public class Test14 {
    public static void main(String[] args) {
        Second second = new Second();
        NoDefault noDefault1 = second.get1(1);
        noDefault1.f();

        System.out.println("========get2=========");

        NoDefault noDefault2 = second.get2(2);
        noDefault2.f();

    }
}
