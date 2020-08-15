package Chapter13.Test7;

import static Chapter13.Test7.MachesStr.matches;

/**
 * @author:YiMing
 * @create:2020/8/15,21:16
 * @version:1.0
 */
public class Test7 {
    public static void main(String[] args) {
        //此处上面引入了import static Chapter13.Test7.MachesStr.matches;
        System.out.println(matches("This is correct."));
        System.out.println(matches("bad sentence 1."));
        System.out.println(matches("Bad sentence 2"));
        System.out.println(matches("This is also correct..."));
    }
}
