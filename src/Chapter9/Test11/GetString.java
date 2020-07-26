package Chapter9.Test11;

/**
 * @author:YiMing
 * @create:2020/7/26,21:01
 * @version:1.0
 */
public class GetString {
    public static String getString(String str) {
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i < str.length() - 1; i += 2) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i + 1, c1);
        }
        return sb.toString();
    }
}
