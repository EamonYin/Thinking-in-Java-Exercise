package Chapter13.Test10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/16,17:49
 * @version:1.0
 */
public class Test10 {
    public static void main(String[] args) {
        String s[]={"^Java","\\Berg.*","n.w\\s+h(a|i)s","S?","S+","s{4}","s{1}.","s{0,3}"};
        String ss="Java now has regular expressions";
        for (String regex:s) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ss);
            while (matcher.find()){
                System.out.println(regex+": "+matcher.group());
            }
        }
    }
}
