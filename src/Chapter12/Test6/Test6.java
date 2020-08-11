package Chapter12.Test6;

import java.io.FileNotFoundException;

/**
 * @author:YiMing
 * @create:2020/8/10,16:11
 * @version:1.0
 */
public class Test6 {
    public static void main(String[] args) {
        try {
            throw new ExceptionOne();

        } catch (ExceptionOne one) {
            System.err.println("Caught " + one);
        }
        try {
            throw new ExceptionTwo();

        } catch (ExceptionTwo two) {
            System.err.println("Caught " + two);
        }
    }
}
