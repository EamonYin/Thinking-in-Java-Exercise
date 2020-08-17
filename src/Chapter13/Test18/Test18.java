package Chapter13.Test18;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/17,14:55
 * @version:1.0
 */
public class Test18 {
    public static void main(String[] args) {
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter13\\Test18\\Test18.java";

        Matcher matcher = Pattern.compile("(\\w+)\\W+", Pattern.DOTALL | Pattern.MULTILINE).matcher("");

        for (String line : new TextFile(path)) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
    }
}
