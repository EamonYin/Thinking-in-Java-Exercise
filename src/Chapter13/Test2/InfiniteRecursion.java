package Chapter13.Test2;

/**
 * @author:YiMing
 * @create:2020/8/15,11:04
 * @version:1.0
 */
public class InfiniteRecursion {
    public String toString() {
        //用super.toString()不用this;因为this会被类型转换，从而发生递归调用
        return "This is " + super.toString() + "\n";
    }
}
