package Chapter11.Test26;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/7,20:55
 * @version:1.0
 */
public class Test26 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> map = new LinkedHashMap<>();
        //获取单词
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter11\\Test24\\";
        List<String> strings = new ArrayList<String>(new TextFile(path + "Test24.java", "\\W+"));

        System.out.println("原："+strings);
        System.out.println();
        int count = 0;

        ArrayList<Integer> wordStation = new ArrayList<>();
        for (String word : strings) {
            count++;
            wordStation = map.get(word);

            //如果map里面没有当前这个word（key）,就重新建立一个空间保存新key
            if (wordStation == null) wordStation = new ArrayList<Integer>();
            //如果key在map里面，就记录count
            wordStation.add(count);
            //存入map
            map.put(word, wordStation);

        }
        System.out.println("新："+map);


    }

}
