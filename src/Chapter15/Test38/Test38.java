package Chapter15.Test38;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/8/28,17:00
 * @version:1.0
 */
public class Test38 {
    public static void main(String[] args) {
        SteamedMilk sm = new SteamedMilk(new BasicCoffee());
        SteamedMilk sm2 = new SteamedMilk(new Foam(new BasicCoffee()));
        Chocolate c = new Chocolate(new BasicCoffee());
        WhippedCream wc = new WhippedCream(new Caramel(new Chocolate(new Foam(new SteamedMilk(new BasicCoffee())))));
        print(wc.getWhippedCream());
    }
}
