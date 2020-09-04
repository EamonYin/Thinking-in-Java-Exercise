package Chapter17.Test18;

import net.mindview.util.Countries;

/**
 * @author:YiMing
 * @create:2020/9/4,22:10
 * @version:1.0
 */
public class Test18 {
    public static void main(String[] args) {
        SlowSet<String> slowSet = new SlowSet<String>();
        slowSet.addAll(Countries.names(10));
        slowSet.addAll(Countries.names(10));
        slowSet.addAll(Countries.names(10));
        System.out.println(slowSet);
    }
}
