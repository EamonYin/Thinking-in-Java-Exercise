package Chapter12.Test9;

/**
 * @author:YiMing
 * @create:2020/8/10,18:53
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {
        Thrower thrower = new Thrower();
        try {
            thrower.f();
        } catch (ExceptionA a) {
            System.out.println("错误：" + a);
        } catch (Exception e) {
            System.out.println("全部错误：" + e);
        }
    }
}
