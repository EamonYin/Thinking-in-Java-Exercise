package Chapter11.Test24;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/7,18:35
 * @version:1.0
 */
public class Test24 {
    public static void main(String[] args) {
        LinkedHashMap<String, Dog> dogAndOwner = new LinkedHashMap<>();
        dogAndOwner.put("a张三",new Dog("Dog旺财"));
        dogAndOwner.put("b李四",new Dog("Dog神犬"));
        dogAndOwner.put("n王五",new Dog("Dog京巴"));
        dogAndOwner.put("d赵六",new Dog("Dog腊肠"));
        //key排序
        Set<String> keyName = dogAndOwner.keySet();
        Set<String> treeSet = new TreeSet<>(keyName);
        Iterator<String> iterator = treeSet.iterator();
        //代填充新Map
        Map<String, Dog> newMap = new LinkedHashMap<>();

        while (iterator.hasNext()){
            String name = iterator.next();
            newMap.put(name,dogAndOwner.get(name));
        }

        System.out.println(newMap);
    }
}
