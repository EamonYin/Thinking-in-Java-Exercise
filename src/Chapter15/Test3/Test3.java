package Chapter15.Test3;

import Chapter15.Test1.Automobile;

/**
 * @author:YiMing
 * @create:2020/8/22,19:06
 * @version:1.0
 */
public class Test3 {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<String, Integer>("haha", 47);
    }

    static TwoTuple<String, String> g() {
        return new TwoTuple<String, String>("haha", "66666");
    }

    static SixTuple<String, Integer, Automobile> h() {
        return new SixTuple<String, Integer, Automobile>("haha", 7777, new Automobile());
    }

    public static void main(String[] args) {
        System.out.println(f());
        System.out.println(g());
        System.out.println(h());
    }

}
