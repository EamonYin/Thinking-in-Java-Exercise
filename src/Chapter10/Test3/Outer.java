package Chapter10.Test3;

/**
 * @author:YiMing
 * @create:2020/7/29,17:16
 * @version:1.0
 */
public class Outer {

    private final String str;

    public Outer(String str){
        this.str = str;
    }

    class Inner {
        public String toString() {
            return str;
        }
    }

    public Inner getInner() {
        return new Inner();

    }


}
