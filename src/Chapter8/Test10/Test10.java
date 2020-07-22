package Chapter8.Test10;

/**
 * @author:YiMing
 * @create:2020/7/22,22:18
 * @version:1.0
 */
public class Test10 {
    public static void main(String[] args) {
        Father fc = new Children();//向上转型
        fc.age(23);
    }
}
