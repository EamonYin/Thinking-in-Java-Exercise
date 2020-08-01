package Chapter10.Test20;

/**
 * @author:YiMing
 * @create:2020/8/1,17:43
 * @version:1.0
 */
public class Test20 implements Nested{
    @Override
    public void f() {
        new InterNested().toString();
    }

    public static void main(String[] args) {
        Test20 test20 = new Test20();
        test20.f();
    }
}
