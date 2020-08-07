package Chapter11.Test16;

import com.sun.javaws.IconUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author:YiMing
 * @create:2020/8/6,17:25
 * @version:1.0
 */
public class Test16 {
    static Set<String> ts = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

    public static void main(String[] args) {

        ts.add("Hello");
        ts.add("Become");
        ts.add("rede");

        TreeSet<Character> yuan = new TreeSet<>();

        Collections.addAll(yuan, 'a', 'o', 'e', 'i', 'u', 'A', 'O', 'E', 'I', 'U');

        for (String s : ts) {
            int count = 0;
            for(Character c : s.toCharArray()){
                if(yuan.contains(c)){
                    count++;
                }
            }
            System.out.println(s+" 含有 "+count+" 个元音字母");
        }


    }
}
