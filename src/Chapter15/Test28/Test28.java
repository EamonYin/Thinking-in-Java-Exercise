package Chapter15.Test28;

import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

/**
 * @author:YiMing
 * @create:2020/8/26,18:40
 * @version:1.0
 */
public class Test28 {
    class Generic1<T> {
        T t;
        <T> void f1(T t) {
        }
    }

    class Generic2<T> {
        T t;
        T f2() {
            return t;
        }
    }

    //泛型方法
    <T> void method1(Generic1<? super T> g1,T t){
        g1.f1(t);
    }

    <T> void method2(Generic2<? extends T> g2){
        System.out.println(g2.f2());
    }

    public static void main(String[] args) {
        Test28 test28 = new Test28();
        test28.method1(test28.new Generic1<Pet>(),new Dog("dogs"));
        test28.method2(test28.new Generic2<>());
    }
}
