package Chapter10.Test23;

/**
 * @author:YiMing
 * @create:2020/8/1,22:15
 * @version:1.0
 */
public class Test23 {
    public static void main(String[] args) {
        A[] aa = {new A(), new A(), new A()};
        B b = new B(3);
        for(int i = 0; i < aa.length; i++)
            b.add(aa[i].MethodAa());
        b.callMethod();
        System.out.println("------------------");
        b.setNull(0);
        b.callMethod();

    }
}
