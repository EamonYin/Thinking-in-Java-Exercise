package Chapter12.Test7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author:YiMing
 * @create:2020/8/9,19:48
 * @version:1.0
 */
public class Test7 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("定义的数组长度：" + arr.length);
        try {
            for (int i = 0; i < 4; i++) {
                arr[i] = i;
            }
        } catch (Exception e) {
            Logger logger = Logger.getLogger("日志");
            logger.severe(e.toString());
        }
    }
}
