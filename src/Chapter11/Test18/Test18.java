package Chapter11.Test18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * @author:YiMing
 * @create:2020/8/7,13:55
 * @version:1.0
 */
public class Test18 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("b","bb");
        map.put("c","cc");
        map.put("a","aa");

        System.out.print(map);

        System.out.println();
        System.out.println("↓给Key排序↓");

        TreeSet<String> treeSet = new TreeSet<>(map.keySet());
        System.out.print(treeSet);

        System.out.println();
        System.out.println("↓体现维护插入顺序↓");

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for(String s:treeSet){
            linkedHashMap.put(s,map.get(s));
        }
        System.out.print(linkedHashMap);

    }
}
