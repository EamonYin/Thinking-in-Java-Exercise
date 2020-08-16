package Chapter13.Test10.findandgroupDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/16,18:12
 * @version:1.0
 */
public class findandgroupDemo {
    public static void main(String[] args) {
        Matcher matcher = Pattern.compile("\\w+")
                .matcher("Evening is full of the linnet's wings");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
