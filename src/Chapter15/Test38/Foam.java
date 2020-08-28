package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,16:58
 * @version:1.0
 */
public class Foam extends Decorator {
    private final String foam = "foam";

    public Foam(BasicCoffee basicCoffee) {
        super(basicCoffee);
    }

    public String getFoam() {
        return foam;
    }
}

