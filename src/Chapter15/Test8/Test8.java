package Chapter15.Test8;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/8/22,21:31
 * @version:1.0
 */
public class Test8 implements Generator<Guy> {
    private static Class[] types = {GoodGuy.class, BadGuy.class};
    Random rand = new Random(47);

    @Override
    public Guy next() {
        try {
            return (Guy) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        Test8 test8 = new Test8();
        for (int i = 0; i < 3; i++){
            System.out.println(test8.next());
        }
    }
}
