package Chapter15.Test23;//: generics/FactoryConstraint.java

public class FactoryConstraint {
    public static void main(String[] args) {
        new Foo2<Integer>(new IntegerFactory(), 1);
        new Foo2<Widget>(new Widget.Factory(), 2);
    }
} ///:~
