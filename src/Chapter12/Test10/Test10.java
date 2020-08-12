package Chapter12.Test10;

/**
 * @author:YiMing
 * @create:2020/8/11,17:51
 * @version:1.0
 */
public class Test10 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.f();
        } catch (MyExceptionB myExceptionB) {
            System.out.println(myExceptionB);
        }
    }
}
