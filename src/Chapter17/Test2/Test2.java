package Chapter17.Test2;

import net.mindview.util.Countries;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/9/1,20:07
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //方法1
        TreeMap<String,String> map =
                new TreeMap<String,String>(Countries.capitals());
        TreeSet<String> set = new TreeSet<String>(Countries.names());
        String b = null;
        for(String s : map.keySet())
            if(s.startsWith("B")) {
                b = s;
                break;
            }
        Map<String,String> aMap = map.headMap(b);
        Set<String> aSet = set.headSet(b);
        System.out.println("aMap = " + aMap);
        System.out.println("aSet = " + aSet);

        System.out.println("========================================");
        //方法2
        for(int i=0;i<Countries.DATA.length;i++)
            if(Pattern.compile("A\\w+").matcher(Countries.DATA[i][0]).matches())
                map.put(Countries.DATA[i][0],Countries.DATA[i][1]);
        Set<String> se=map.keySet();
        System.out.println(se);


    }
}
