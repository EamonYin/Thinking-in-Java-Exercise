package Chapter10.Test21;

/**
 * @author:YiMing
 * @create:2020/8/1,17:49
 * @version:1.0
 */
public class Test21 {
    public static void main(String[] args) {
        Nested nested = new Nested() {
            @Override
            public void f() {

            }
        };

        Nested.InterNested.InterMethod(nested);
    }
}
