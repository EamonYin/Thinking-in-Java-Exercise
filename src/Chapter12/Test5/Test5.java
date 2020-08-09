package Chapter12.Test5;

/**
 * @author:YiMing
 * @create:2020/8/9,20:15
 * @version:1.0
 */
public class Test5 {

    public static void main(String[] args) {
        TestException testException = new TestException();
        while (true) {
            try {
                testException.f();
            } catch (MyException2 me) {
                System.out.println(me);
                continue;
            }
            System.out.println("通过~");
            break;
        }
        System.out.println("解决问题~");
    }
}
