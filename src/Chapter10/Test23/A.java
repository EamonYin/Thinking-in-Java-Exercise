package Chapter10.Test23;

/**
 * @author:YiMing
 * @create:2020/8/1,20:15
 * @version:1.0
 */
public class A {
    public U MethodAa() {
        return new U() {
            @Override
            public void MethodUa() {
                System.out.println("A.MethodUa");
            }

            @Override
            public void MethodUb() {
                System.out.println("A.MethodUb");
            }

            @Override
            public void MethodUc() {
                System.out.println("A.MethodUc");
            }
        };
    }
}
