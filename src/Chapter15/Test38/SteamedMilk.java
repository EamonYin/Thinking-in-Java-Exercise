package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,16:55
 * @version:1.0
 */
public class SteamedMilk extends Decorator {
    private final String steamedMilk = "steamedMilk";

    public SteamedMilk(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getSteamedMilk() {
        return steamedMilk;
    }
}
