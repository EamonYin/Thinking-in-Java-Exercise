package Chapter12.Test25;

/**
 * @author:YiMing
 * @create:2020/8/14,15:07
 * @version:1.0
 */
public class Test25 {
    public static void main(String[] args) {
        A c = new C();
        try {
            c.AThrow();
        } catch (AException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
