package Chapter12.Test18;

/**
 * @author:YiMing
 * @create:2020/8/12,21:13
 * @version:1.0
 */
public class Test18 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            Test18 test18 = new Test18();
            try {
                test18.f();
            } finally {
                try {
                    test18.dispose();
                } finally {
                    throw new Exception3();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
