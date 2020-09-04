package Chapter17.Test15;

import net.mindview.util.TextFile;

import java.util.List;

/**
 * @author:YiMing
 * @create:2020/9/4,22:03
 * @version:1.0
 */
public class Test15 {
    public static void main(String[] args) {
        List<String> words = new TextFile("G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter17\\Test13\\AssociativeArray.java", "\\W+");
        SlowMap<String, Integer> map = new SlowMap<String, Integer>();
        for (String word : words) {
            Integer freq = map.get(word);
            map.put(word, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
