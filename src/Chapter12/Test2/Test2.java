package Chapter12.Test2;

/**
 * @author:YiMing
 * @create:2020/8/9,19:44
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        String s = null;
        try {
            s.toString();
        } catch (Exception e) {
            System.out.println("捕获异常"+e);
        }finally {
            System.out.println("捕获结束");
        }
    }
}
