package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,16:58
 * @version:1.0
 */
public class Chocolate extends Decorator {
    private final String chocolate = "chocolate";

    public Chocolate(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getChocolate() {
        return chocolate;
    }
}
