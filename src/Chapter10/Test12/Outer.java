package Chapter10.Test12;

/**
 * @author:YiMing
 * @create:2020/7/30,18:35
 * @version:1.0
 */
public class Outer {
    private int i;

    private void IsOuter() {
        System.out.println("This is Outer.IsOuter()");
    }

        public void h() {
            new Outer() {
                void g() {
                    i++;
                    IsOuter();
                }
            }.g();
            System.out.println("i = " + i);
        }
}
