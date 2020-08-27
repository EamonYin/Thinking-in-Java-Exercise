package Chapter15.Test34;

/**
 * @author:YiMing
 * @create:2020/8/27,18:53
 * @version:1.0
 */
public class Test34 {
    public static void main(String[] args) {
        ConcreteProcessor concreteProcessor = new ConcreteProcessor();
        System.out.println(concreteProcessor == concreteProcessor.test());
    }
}
