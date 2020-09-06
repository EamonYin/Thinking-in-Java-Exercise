package Chapter17.Test40;

import net.mindview.util.Generator;
import net.mindview.util.RandomGenerator;

import java.util.Comparator;

/**
 * @author:YiMing
 * @create:2020/9/6,20:22
 * @version:1.0
 */
public class TwoString implements Comparable<TwoString> {
    String s1, s2;

    public TwoString(String s1i, String s2i) {
        s1 = s1i;
        s2 = s2i;
    }

    @Override
    public int compareTo(TwoString rv) {
        String rvi = rv.s1;
        return s1.compareTo(rvi);
    }

    private static RandomGenerator.String gen = new RandomGenerator.String();

    public static Generator<TwoString> generator() {
        return new Generator<TwoString>() {
            public TwoString next() {
                return new TwoString(gen.next(), gen.next());
            }
        };
    }

    //Test41可以用作HashSet、HashMap
    public int hashCode() {
        // Since the comparisons are based on s1,
        // use s1's hashCode:
        return s1.hashCode();
    }

    public boolean equals(Object obj) {
        return obj instanceof TwoString &&
                ((TwoString) obj).s1.equals(s1);
    }

    public String toString() {
        return "[s1 = " + s1 + ", s2 = " + s2 + "]";
    }
}

class CompareSecond implements Comparator<TwoString> {
    public int compare(TwoString sc1, TwoString sc2) {
        return sc1.s2.compareTo(sc2.s2);
    }
}

