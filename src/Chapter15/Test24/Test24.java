package Chapter15.Test24;

import Chapter15.Test23.IntegerFactory;
import Chapter15.Test23.Widget;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/25,17:10
 * @version:1.0
 */
public class Test24 {
    public static void main(String[] args) {
        FactoryCapture fc = new FactoryCapture();
        fc.addFactory("Integer", new IntegerFactory());
        fc.addFactory("Widget", new Widget.Factory());
        print(fc.createNew("Integer", 1));
        print(fc.createNew("Widget", 2));
        fc.createNew("Product", 3);
    }
}
