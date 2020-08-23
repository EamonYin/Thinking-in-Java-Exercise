package Chapter15.Test18;

import net.mindview.util.Generator;

/**
 * @author:YiMing
 * @create:2020/8/23,19:30
 * @version:1.0
 */
public class BigFish {
    private static long counter = 1;
    private final long id = counter++;

    private BigFish() {
    }

    public String toString() {
        return "BigFish " + id;
    }

    public static Generator<BigFish> generator =
            new Generator<BigFish>() {
                public BigFish next() {
                    return new BigFish();
                }
            };
}
