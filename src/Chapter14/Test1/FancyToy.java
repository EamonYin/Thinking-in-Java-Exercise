package Chapter14.Test1;

import Chapter14.Test2.Test2NewInterface;

/**
 * @author:YiMing
 * @create:2020/8/18,17:22
 * @version:1.0
 */
public class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots{
    FancyToy() {
        super(1);
    }
}