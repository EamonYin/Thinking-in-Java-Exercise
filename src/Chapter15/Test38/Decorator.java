package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,16:57
 * @version:1.0
 */
public class Decorator extends BasicCoffee{
    protected BasicCoffee basicCoffee;

    public Decorator(BasicCoffee basicCoffee) {
        this.basicCoffee = basicCoffee;
    }

    public void set(String val) {
        basicCoffee.set(val);
    }

    public String get() {
        return basicCoffee.get();
    }
}
