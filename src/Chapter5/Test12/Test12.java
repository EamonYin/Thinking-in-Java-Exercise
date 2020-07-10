package Chapter5.Test12;

/**
 * @author:YiMing
 * @create:2020/7/6,18:23
 * @version:1.0
 */
public class Test12 {
    public static void main(String[] args) throws Throwable {
        Tank tank = new Tank();
        tank.FlagEmpty();
        tank.finalize();
//        Tank tank2 = new Tank();
        System.gc();

    }
}
