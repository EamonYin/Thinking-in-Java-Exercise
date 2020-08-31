package Chapter16.Test17;

import java.math.*;
import java.util.*;
import net.mindview.util.*;

/**
 * @author:YiMing
 * @create:2020/8/31,16:41
 * @version:1.0
 */
public class BigDecimalGenerator  implements Generator<BigDecimal>{
    private BigDecimal value = new BigDecimal(0);
    private BigDecimal step;
    BigDecimalGenerator(BigDecimal step) { this.step = step; }
    public BigDecimal next() {
        BigDecimal oldValue = value;
        value = value.add(step);
        return oldValue;
    }
}
