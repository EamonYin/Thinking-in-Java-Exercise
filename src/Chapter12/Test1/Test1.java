package Chapter12.Test1;

/**
 * @author:YiMing
 * @create:2020/8/9,19:40
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            throw new Exception("An exception in main");
        } catch (Exception e) {
            System.out.println(
                    "e.getMessage() = " + e.getMessage());
        } finally {
            System.out.println("In finally clause");
        }
    }
}
