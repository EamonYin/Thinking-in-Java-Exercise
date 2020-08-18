package Chapter14.Test2;

import Chapter14.Test1.HasBatteries;
import Chapter14.Test1.Shoots;
import Chapter14.Test2.Toy;
import Chapter14.Test1.Waterproof;

/**
 * @author:YiMing
 * @create:2020/8/18,17:22
 * @version:1.0
 */
public class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots, Test2NewInterface {
    FancyToy() {
        super(1);
    }
}