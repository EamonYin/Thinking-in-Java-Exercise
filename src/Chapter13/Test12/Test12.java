package Chapter13.Test12;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/16,21:10
 * @version:1.0
 */
public class Test12 {
    static public final String POEM =
            "Twas brillig, and the slithy toves\n" +
                    "Did gyre and gimble in the wabe.\n" +
                    "All mimsy were the borogoves,\n" +
                    "And the mome raths outgrabe.\n\n" +
                    "Beware the Jabberwock, my son,\n" +
                    "The jaws that bite, the claws that catch.\n" +
                    "Beware the Jubjub bird, and shun\n" +
                    "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\b((?![A-Z])\\w+)\\b");
        Matcher matcher = pattern.matcher(POEM);
        Set<String> strings = new HashSet<>();
        while (matcher.find()){
          strings.add(matcher.group());
        }
        System.out.println("不以大写字母开头单词个数："+strings.size());
        System.out.println(strings.toString());
    }
}
