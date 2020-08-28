package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,17:00
 * @version:1.0
 */
public class WhippedCream extends Decorator {
    private final String whippedCream = "whippedCream";

    public WhippedCream(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getWhippedCream() {
        return whippedCream;
    }
}
