package Chapter13.Test17;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/17,14:55
 * @version:1.0
 */
public class Test17 {
    public static void main(String[] args) {
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter13\\Chapter21.Test17.Chapter21.Test17\\Chapter21.Test17.Chapter21.Test17.java";

        Matcher matcher = Pattern.compile("(/\\*(.*)\\*/)|(.*(//.*$))", Pattern.DOTALL | Pattern.MULTILINE).matcher("");
        //for循环
        for (String line : new TextFile(path)) {
            matcher.reset(line);
            while (matcher.find()) {
                System.out.print(matcher.group(1)+"\n"+matcher.group(4));
            }
        }
    }
}
