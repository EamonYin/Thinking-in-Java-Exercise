package Chapter12.Test5;

/**
 * @author:YiMing
 * @create:2020/8/9,20:13
 * @version:1.0
 */
public class TestException {
    int i = 3;

    public void f() throws MyException2 {
        if (--i > 0) {
            throw new MyException2();
        }
    }
}
