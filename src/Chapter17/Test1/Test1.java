package Chapter17.Test1;

import net.mindview.util.Countries;

import static net.mindview.util.Print.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/9/1,20:02
 * @version:1.0
 */
public class Test1 {
    private static Random rnd = new Random(47);

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>(Countries.names(8));
        Collections.sort(strings);
        print("sorted: " + strings);
        for (int i = 1; i < 5; i++) {
            //static void shuffle(List<?> list, Random rand) 使用指定的随机源对指定列表进行置换，
            //所有置换发生的可能性都是大致相等的，假定随机源是公平的。
            //就像洗牌一样，随机打乱原来的顺序
            Collections.shuffle(strings, rnd);
            print("shuffled (" + i + "): " + strings);
        }
    }
}
