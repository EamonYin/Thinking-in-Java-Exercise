package Chapter14.Test21;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/8/21,18:10
 * @version:1.0
 */
public class SimpleProxy implements Interface {
    private static int count = 0;
    private static int scount = 0;
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    public void doSomething() {
        print("SimpleProxy doSomething");
        proxied.doSomething();
        print(++count);
    }

    public void somethingElse(String arg) {
        print("SimpleProxy somethingElse " + arg);
        proxied.somethingElse(arg);
        print(++scount);
    }
}
