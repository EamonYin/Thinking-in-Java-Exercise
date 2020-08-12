package Chapter12.Test19;

import Chapter12.Test18.Exception3;

/**
 * @author:YiMing
 * @create:2020/8/12,21:13
 * @version:1.0
 */
public class Test19 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            Test19 test19 = new Test19();
            try {
                test19.f();
            } catch (VeryImportantException ve) {
                System.out.println(ve);
            } finally {
                test19.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
