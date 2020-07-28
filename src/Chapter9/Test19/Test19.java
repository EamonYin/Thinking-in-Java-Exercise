package Chapter9.Test19;

/**
 * @author:YiMing
 * @create:2020/7/28,21:00
 * @version:1.0
 */
public class Test19 {

    public static void simulate(tossingFactory fact) {
        tossing t = fact.getTossing();
        for (int i = 0; i < 10; i++) {
            System.out.println(t.surface());
        }
    }

    public static void main(String[] args) {
        System.out.println("硬币");
        simulate(new coinFactory());
        System.out.println("骰子");
        simulate(new diceFactory());
    }
}
