package Chapter14.Test21;

import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/21,18:09
 * @version:1.0
 */
public class RealObject implements Interface {
    public void doSomething() { print("doSomething"); }
    public void somethingElse(String arg) {
        print("somethingElse " + arg);
    }

}
