package Chapter13.Test19;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/17,15:04
 * @version:1.0
 */
public class Test19 {
    public static void main(String[] args) {
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter13\\Test19\\Test19.java";

        Matcher matcher = Pattern.compile("class (\\w+)\\W+", Pattern.DOTALL | Pattern.MULTILINE).matcher("");

        for (String line : new TextFile(path)) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
            }
        }
    }
}
