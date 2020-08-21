package Chapter14.Test21;

/**
 * @author:YiMing
 * @create:2020/8/21,18:11
 * @version:1.0
 */
public class Test21 {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }
}
