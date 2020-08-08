package Chapter11.Test22;

import net.mindview.util.TextFile;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/7,17:10
 * @version:1.0
 */
public class Test22 {
    public static void main(String[] args) {
        //获取Test21.java中的单词
        String path = "G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter11\\Test22\\";
        List<String> strings = new ArrayList<String>(new TextFile(path + "Test22.java", "\\W+"));
        System.out.println(strings);
        //存放统计结果
        Set<Contain> contains = new LinkedHashSet<Contain>();

        Contain c1,c2;

        for (String word : strings) {
            boolean flag = false;
            Iterator<Contain> iterator = contains.iterator();
            while (iterator.hasNext()){
                c1 = iterator.next();
                if(c1.getName().equals(word)){
                    c1.addCount();
                    flag = true;
                }
            }
            if(!flag) contains.add(new Contain(word));
        }
        Iterator<Contain> iterator2 = contains.iterator();
        while (iterator2.hasNext()){
            c2 = iterator2.next();
            System.out.println("单词【"+c2.getName()+"】有"+c2.getCount()+"个");
        }
    }
}
