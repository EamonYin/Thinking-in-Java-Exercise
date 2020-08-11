package Chapter12.Test9;

/**
 * @author:YiMing
 * @create:2020/8/10,18:52
 * @version:1.0
 */
public class Thrower {
    void f() throws ExceptionA, ExceptionB, ExceptionC {
        throw new ExceptionA();
    }
}
