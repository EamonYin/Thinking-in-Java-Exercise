package Chapter15.Test18;

import net.mindview.util.Generator;

/**
 * @author:YiMing
 * @create:2020/8/23,19:27
 * @version:1.0
 */
public class LittleFish {
    private static long counter = 1;
    private final long id = counter++;

    public LittleFish() {
    }

    public String toString() {
        return "LittleFish " + id;
    }

    public static Generator<LittleFish> generator() {
        return new Generator<LittleFish>() {

            @Override
            public LittleFish next() {
                return new LittleFish();
            }
        };
    }
}
