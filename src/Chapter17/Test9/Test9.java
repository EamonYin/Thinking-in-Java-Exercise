package Chapter17.Test9;

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.TreeSet;

/**
 * @author:YiMing
 * @create:2020/9/2,19:36
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        ts.addAll(CollectionData.list(new RandomGenerator.String(), 10));
        System.out.println(ts);
    }
}
