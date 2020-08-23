package Chapter15.Test19;

import Chapter15.Test18.Generators;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/8/23,20:10
 * @version:1.0
 */
//集装箱
public class Container extends ArrayList<Product> {
    public Container(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}
