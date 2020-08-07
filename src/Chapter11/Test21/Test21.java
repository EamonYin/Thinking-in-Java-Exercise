package Chapter11.Test21;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/7,16:40
 * @version:1.0
 */
public class Test21 {
    public static void main(String[] args) {
        //获取Test21.java中的单词
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter11\\Test21\\";
        List<String> strings = new ArrayList<String>(new TextFile(path+"Test21.java","\\W+"));
        System.out.println(strings);
        //按字母顺序排列
        Collections.sort(strings,String.CASE_INSENSITIVE_ORDER);
        System.out.println("按字母顺序排列"+strings);

        Map<String,Integer> map=new LinkedHashMap<String,Integer>();
        for(String word : strings){
            Integer in = map.get(word);
            map.put(word,in==null?1:in+1);
        }
        System.out.println("单词出现次数："+map);
    }
}
