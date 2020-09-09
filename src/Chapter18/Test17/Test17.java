package Chapter18.Test17;

import net.mindview.util.TextFile;

import java.util.*;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/9/9,17:50
 * @version:1.0
 */
public class Test17 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        ArrayList<String> strings = new TextFile("./src/Chapter18/Test17/C18T17测试文件.txt", "\\W");
        System.out.println(strings);
        Iterator<String> iterator = strings.iterator();
        String s;
        Integer count = 0;
        while (iterator.hasNext()) {
            s = iterator.next();
            for (int i = 0; i < s.length(); i++) {
                Character ch = s.charAt(i);
                Integer freq = map.get(ch);
                map.put(ch, freq == null ? 1 : freq + 1);
            }
            List<Character> keys = Arrays.asList(map.keySet().toArray(new Character[0]));
            Collections.sort(keys);
            for (Character key : keys)
                System.out.println(key + " => " + map.get(key));
        }
    }
}
