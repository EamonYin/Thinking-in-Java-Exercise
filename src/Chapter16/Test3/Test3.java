package Chapter16.Test3;

/**
 * @author:YiMing
 * @create:2020/8/30,16:53
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Double[][] doubles = a.MadeDoubleArray(2, 1, 47.0, 47.01);
        b.printArray(doubles);
        System.out.println();
        b.printArrayB(doubles);
    }
}
