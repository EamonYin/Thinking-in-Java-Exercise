package Chapter15.Test3;

/**
 * @author:YiMing
 * @create:2020/8/22,19:04
 * @version:1.0
 */
public class SixTuple<A, B, C> extends TwoTuple<A, B> {
    public final C c;

    public SixTuple(A a, B b, C six) {
        super(a, b);
        this.c = six;
    }

    public String toString() {
        return "(" + first + ", " + second +", " + c + ")";
    }
}
