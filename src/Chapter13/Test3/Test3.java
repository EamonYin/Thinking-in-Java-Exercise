package Chapter13.Test3;

import java.util.Formatter;

/**
 * @author:YiMing
 * @create:2020/8/15,11:35
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter(System.err);
        Turtle tommy = new Turtle("Tommy", formatter),
                terry = new Turtle("Terry", formatter);
        tommy.move(0, 0);
        terry.move(4, 8);
        tommy.move(3, 4);
        terry.move(2, 5);
        tommy.move(3, 3);
        terry.move(3, 3);
    }
}
