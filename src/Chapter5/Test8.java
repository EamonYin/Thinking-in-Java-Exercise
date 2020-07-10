package Chapter5;

/**
 * @author:YiMing
 * @create:2020/7/5,18:59
 * @version:1.0
 */
public class Test8 {
    public void method1(){
        System.out.println("1");
        method2().method2();
    }
    public Test8 method2(){
        System.out.println("2");
        return this;
    }

    public static void main(String[] args) {
        Test8 test8 = new Test8();
        test8.method1();
    }
}
