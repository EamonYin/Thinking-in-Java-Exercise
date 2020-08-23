package Chapter15.Test11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/23,15:44
 * @version:1.0
 */
public class Test11 {
    public static void main(String[] args) {
        New aNew = new New();

        List<List<String>> list = aNew.list();
        list.add(Arrays.asList("a1","a2","a3"));
        list.add(Arrays.asList("b1","b2","b3","b4"));
        System.out.println(list);

    }
}
