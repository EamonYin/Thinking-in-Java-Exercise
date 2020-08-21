package Chapter14.Test25;

import Chapter14.Test25.ClassA.ClassA;
import Chapter7.Test7.A;

/**
 * @author:YiMing
 * @create:2020/8/21,21:31
 * @version:1.0
 */
public class Test25 {
    public static void main(String[] args) throws Exception {
        class B extends ClassA {
            protected void b() { super.b(); }
        }

        ClassA classA = new ClassA();
        //! classA.a(); Compile time error
        //! classA.b(); Compile time error
        //! classA.c(); Compile time error
        //反射
        HiddenMethodCalls hmc = new HiddenMethodCalls();
        System.out.println("-----------反射 BEGIN---------");
        hmc.callHiddenMethod(classA,"a");
        hmc.callHiddenMethod(classA,"b");
        hmc.callHiddenMethod(classA,"c");
        System.out.println("-----------反射 END-----------");
        B b = new B();
        b.b();
    }
}
