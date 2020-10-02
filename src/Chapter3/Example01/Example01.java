package Chapter3.Example01;


/**
 * @author:YiMing
 * @create:2020/10/2,13:49
 * @version:1.0
 */
public class Example01 {
    public static void main(String[] args) {
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);

        //"=="和“!=”比较的是[对象引用]
        System.out.println("n1 == n2: " + (n1 == n2));//false
        System.out.println("n1 != n2: " + (n1 != n2) + "\n");//true


        //equals()比较的是实际内容，不适用于“基本类型”，基本类型使用”==“和”!=“
        System.out.println("n1.equals(n2): " + (n1.equals(n2)) + "\n");//true

        //equals()默认比较引用，除非再自己的类中覆盖equals方法
        value v1 = new value();
        value v2 = new value();
        v1.i = v2.i = 100;
        System.out.println("v1.equals(v2): " + (v1.equals(v2)));//false
    }

    static class value {
        int i;
    }
}
