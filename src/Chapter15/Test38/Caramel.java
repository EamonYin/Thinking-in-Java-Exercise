package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,16:59
 * @version:1.0
 */
public class Caramel extends Decorator {
    private final String caramel = "caramel";

    public Caramel(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getCaramel() {
        return caramel;
    }
}
