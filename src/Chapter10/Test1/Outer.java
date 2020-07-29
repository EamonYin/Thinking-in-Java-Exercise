package Chapter10.Test1;

/**
 * @author:YiMing
 * @create:2020/7/29,17:16
 * @version:1.0
 */
public class Outer {
    class Inner {

        String str;

        Inner(String str) {
            this.str = str;
        }

        public String value() {
            return "This is" + str;
        }

        public String toString() {
            return value();
        }
    }

    public Inner getInner(String str) {
        return new Inner(str);

    }


}
