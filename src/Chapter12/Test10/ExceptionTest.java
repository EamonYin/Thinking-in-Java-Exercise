package Chapter12.Test10;

/**
 * @author:YiMing
 * @create:2020/8/11,17:46
 * @version:1.0
 */
public class ExceptionTest {
    void g() throws MyException {
        throw new MyException();
    }

    void f() throws MyExceptionB {
        try {
            g();
        } catch (MyException e) {
            throw new MyExceptionB();
        }
    }
}
