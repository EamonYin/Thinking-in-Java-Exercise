package Chapter13.Test15;

import net.mindview.util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/17,14:39
 * @version:1.0
 */
public class Test15 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1], Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);

        int index = 0;
        Matcher m = p.matcher("");

        for (String line : new TextFile(args[0])) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
}
