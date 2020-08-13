package Chapter12.Test21;

/**
 * @author:YiMing
 * @create:2020/8/13,20:11
 * @version:1.0
 */
public class Test21 {
    public static void main(String[] args) {
        try {
            Children children = new Children();
        } catch (FatherException fe) {
            System.out.println(fe);
        }
    }
}
