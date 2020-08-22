package Chapter15.Test9;//: generics/GenericMethods.java

public class GenericMethods {
    //(T... x)可变参数，可以传不定个数参数
    public <T> void f(T... x) {
        System.out.println(x.getClass().getName());
    }

    public <T,U,V> void g(T x,U u,V v) {
        System.out.println(x.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(v.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        gm.g(gm,1.0f,'c');
        System.out.println("**********************");
        gm.f("1", 1.0f, true);
        System.out.println("----------------------");

        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);
    }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
