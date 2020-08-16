package Chapter13.Test11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/16,18:14
 * @version:1.0
 */
public class Test11 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(?i)((^[aeiou])|(\\s+[aeiou]))\\W+?[aeiou]\\b");
        Matcher m = p.matcher("Arline ate eight apples and one orange while Anita hadn't any");
        if (m.find()) System.out.println(m.group());
        else System.out.println("no");
    }
}
