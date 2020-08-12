package Chapter12.Test15;

/**
 * @author:YiMing
 * @create:2020/8/12,13:21
 * @version:1.0
 */
public class Test15 {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {
    }

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            throw new RuntimeException();
            //Error:(19, 13) java: 无法访问的语句
            //sw.off();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off();
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        } finally {
            sw.off();
        }


    }
}

