package Chapter10.Test10;

/**
 * @author:YiMing
 * @create:2020/7/30,21:23
 * @version:1.0
 */
public class SI {
    public SimpleInterface get() {
        {
            class SII implements SimpleInterface{
                public void f() {
                    System.out.println("SI.f");
                }
            }
            return new SII();
        }
    }
}
