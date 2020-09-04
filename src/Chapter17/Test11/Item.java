package Chapter17.Test11;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/9/3,15:00
 * @version:1.0
 */
public class Item implements Comparable<Item> {
    private static final Random rnd = new Random(47);
    private Integer priority = rnd.nextInt(101);

    @Override
    public int compareTo(Item o) {
        return priority < o.priority ? -1 :
                priority == o.priority ? 0 : 1;
    }

    public String toString() {
        return Integer.toString(priority);
    }
}
