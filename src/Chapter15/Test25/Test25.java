package Chapter15.Test25;

/**
 * @author:YiMing
 * @create:2020/8/25,20:30
 * @version:1.0
 */
public class Test25 {
    static <T extends Top> void top(T obj){
        obj.a();
        obj.b();
    }
    static <T extends Low> void low(T obj){
        obj.c();
        obj.d();
    }

    public static void main(String[] args) {
        TopLowImpl topLow = new TopLowImpl();
        top(topLow);
        low(topLow);
    }
}
