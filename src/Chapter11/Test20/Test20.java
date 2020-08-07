package Chapter11.Test20;

import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author:YiMing
 * @create:2020/8/7,15:56
 * @version:1.0
 */
public class Test20 {
    static Set<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
    public static void main(String[] args) {
        ts.add("Hello");
        ts.add("Become");
        ts.add("red");
        ts.add("China");

        TreeSet<Character> yuan = new TreeSet<>();
        Collections.addAll(yuan, 'a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U');

        //统计元音字母出现次数
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (String word :ts){
            int count = 0;
            for(Character c:word.toCharArray()){
                if(yuan.contains(c)){
                    count++;
                    Integer yuanCount = countMap.get(c);
                    countMap.put(c,yuanCount == null ? 1 : yuanCount+1);
                }
            }
        }
        System.out.println(countMap);
    }
}
