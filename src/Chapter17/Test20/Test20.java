package Chapter17.Test20;

import net.mindview.util.Countries;

/**
 * @author:YiMing
 * @create:2020/9/4,23:28
 * @version:1.0
 */
public class Test20 {
    public static void main(String[] args) {
        SimpleHashMaps2<String, String> m = new SimpleHashMaps2<String, String>();
        m.putAll(Countries.capitals(25));
        m.putAll(Countries.capitals(25));
        System.out.println(m);
    }
}
