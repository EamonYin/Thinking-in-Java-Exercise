package Chapter13.Test6;

import java.util.Formatter;

/**
 * @author:YiMing
 * @create:2020/8/15,19:30
 * @version:1.0
 */
public class Test6 {
    public static void main(String[] args) {
        int intField = 1;
        long longField = 2L;
        float floatField = 3.0f;
        double doubleField = 4.0;
        FormatClass formatClass = new FormatClass(intField, longField, floatField, doubleField);
        System.out.println(formatClass);
    }
}
