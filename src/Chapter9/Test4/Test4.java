package Chapter9.Test4;

/**
 * @author:YiMing
 * @create:2020/7/25,19:03
 * @version:1.0
 */
public class Test4 {
    public static void test1(NoMethods nm){
        ((Extended1)nm).f();//因为NoMethods没有f（）这个方法，所以需要向下转型
    }
    public static void test2(WithMethods wm){
        wm.f();
    }

    public static void main(String[] args) {
        NoMethods nm = new Extended1();
        test1(nm);
        WithMethods wm = new Extended2();
        test2(wm);
    }

}
