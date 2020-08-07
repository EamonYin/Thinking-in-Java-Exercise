package Chapter11.Test19;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/7,13:55
 * @version:1.0
 */
public class Test19 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("b","bb");
        map.put("c","cc");
        map.put("a","aa");

        System.out.print(map);

        System.out.println();
        System.out.println("↓给Key排序↓,HashSet");

        HashSet<String> hashSet = new HashSet<>(map.keySet());
        System.out.print(hashSet);

        System.out.println();
        System.out.println("↓给Key排序↓,LinkedHashSet");

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(map.keySet());
        System.out.print(linkedHashSet);

        System.out.println();
        System.out.println("↓体现维护插入顺序↓,HashSet");

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        for(String s:hashSet){
            linkedHashMap.put(s,map.get(s));
        }
        System.out.print(linkedHashMap);

        System.out.println();
        System.out.println("↓体现维护插入顺序↓,LinkedHashSet");

        for(String s:linkedHashSet){
            linkedHashMap.put(s,map.get(s));
        }
        System.out.print(linkedHashMap);


    }
}
