package Chapter3.Example02;//: operators/ShortCircuit.java
// Demonstrates short-circuiting behavior
// with logical operators.

import static net.mindview.util.Print.*;

public class ShortCircuit {
    static boolean test1(int val) {
        print("test1(" + val + ")");
        print("val < 1 结果: " + (val < 1) + "\n");
        return val < 1;
    }

    static boolean test2(int val) {
        print("test2(" + val + ")");
        print("val < 2 结果: " + (val < 2) + "\n");
        return val < 2;
    }

    static boolean test3(int val) {
        print("test3(" + val + ")");
        print("val < 3 结果: " + (val < 3) + "\n");
        return val < 3;
    }

    public static void main(String[] args) {
        /**
         * test1 true;
         * test2 false 【短路】
         */
        boolean b = test1(0) && test2(2) && test3(2);
        print("表达式结果： " + b);
    }
} /* Output:
test1(0)
result: true
test2(2)
result: false
expression is false
*///:~

