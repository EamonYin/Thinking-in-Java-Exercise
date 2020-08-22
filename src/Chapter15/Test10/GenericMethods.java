package Chapter15.Test10;//: generics/GenericMethods.java

public class GenericMethods {

    public <T, U, String> void h(T x, U u, String str) {
        System.out.println(x.getClass().getName());
        System.out.println(u.getClass().getName());
        System.out.println(str.getClass().getName());
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(str);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        gm.h(gm, 1.0f, 'c');

    }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
