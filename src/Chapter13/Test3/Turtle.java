package Chapter13.Test3;

import java.util.Formatter;

/**
 * @author:YiMing
 * @create:2020/8/15,17:24
 * @version:1.0
 */
public class Turtle {
    private final String name;
    private final Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
}
