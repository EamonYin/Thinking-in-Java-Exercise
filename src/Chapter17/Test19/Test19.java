package Chapter17.Test19;

import net.mindview.util.TextFile;

import java.util.List;

/**
 * @author:YiMing
 * @create:2020/9/4,23:25
 * @version:1.0
 */
public class Test19 {
    public static void main(String[] args) {
        List<String> words = new TextFile("G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter17\\Test13\\AssociativeArray.java", "\\W+");
        SimpleHashMap<String, Integer> map = new SimpleHashMap<String, Integer>();
        for (String word : words) {
            Integer freq = map.get(word);
            map.put(word, freq == null ? 1 : freq + 1);
        }
        System.out.println(map);
    }
}
