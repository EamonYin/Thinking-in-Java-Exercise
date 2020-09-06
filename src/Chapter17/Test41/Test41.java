package Chapter17.Test41;

import Chapter17.Test40.TwoString;
import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author:YiMing
 * @create:2020/9/6,20:29
 * @version:1.0
 */
public class Test41 {
    public static void main(String[] args) {
        HashSet<TwoString> hs = new HashSet<TwoString>();
        HashMap<TwoString, Integer> hm = new HashMap<TwoString, Integer>();
        Generator<TwoString> gen = TwoString.generator();
        hs.addAll(CollectionData.list(gen, 20));
        for (int i = 0; i < 20; i++)
            hm.put(gen.next(), i);
        System.out.println("hs = " + hs);
        System.out.println("hm = " + hm);
    }
}
