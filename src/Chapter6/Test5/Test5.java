package Chapter6.Test5;

import Chapter6.Test5.TestPackage.TestPower;

/**
 * @author:YiMing
 * @create:2020/7/12,22:50
 * @version:1.0
 */
public class Test5 extends TestPower {
    public void TakeProtectMethod(){
        C();
    }

    public static void main(String[] args) {
        Test5 test5 = new Test5();
        System.out.println("-----------public A()------------");
        test5.A();

        System.out.println("-----------TestPower(Privated) B()无法被调用------------");

        System.out.println("-----------TestPower(Protected) C()------------");
        test5.C();

        System.out.println("----------TakeProtectMethod----------");
        test5.TakeProtectMethod();
    }
}
