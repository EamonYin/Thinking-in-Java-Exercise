package Chapter13.Test7;

/**
 * @author:YiMing
 * @create:2020/8/15,21:18
 * @version:1.0
 */
public class MachesStr {
    public static boolean matches(String text) {
        return text.matches("\\p{javaUpperCase}.*\\\\.");
    }
}
