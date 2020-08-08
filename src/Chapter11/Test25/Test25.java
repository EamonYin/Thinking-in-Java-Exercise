package Chapter11.Test25;

import net.mindview.util.TextFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/7,19:46
 * @version:1.0
 */
public class Test25 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter11\\Test24\\";
        List<String> strings = new ArrayList<String>(new TextFile(path + "Test24.java", "\\W+"));

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            count++;
            String word = iterator.next();
            ArrayList<Integer> al;
            al = map.get(word);
            if (al == null) al = new ArrayList<Integer>();
            al.add(count);
            map.put(word, al);

        }
        System.out.println(map);
    }
}
