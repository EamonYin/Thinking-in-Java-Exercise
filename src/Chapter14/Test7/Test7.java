package Chapter14.Test7;

/**
 * @author:YiMing
 * @create:2020/8/18,18:31
 * @version:1.0
 */
public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException {
        for (String arg :
                args) {
            Class.forName(arg);
        }
    }
}
