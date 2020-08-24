package Chapter15.Test20;

/**
 * @author:YiMing
 * @create:2020/8/24,18:43
 * @version:1.0
 */
public class Test20 {
    static <T extends Top> void f(T obj) {
        obj.a();
        obj.b();
        //无法在Top接口中找到c()
        //obj.c();
    }

    public static void main(String[] args) {
        CombinedImpl combined = new CombinedImpl();
        f(combined);
    }
}
