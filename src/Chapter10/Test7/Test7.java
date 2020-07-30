package Chapter10.Test7;

/**
 * @author:YiMing
 * @create:2020/7/30,18:42
 * @version:1.0
 */
public class Test7 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        for(int i = 0 ; i < 10 ; i++)
        outer.getInner();
    }
}
