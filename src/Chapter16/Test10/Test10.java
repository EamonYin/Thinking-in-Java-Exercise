package Chapter16.Test10;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/30,18:16
 * @version:1.0
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList<List<String>> ls =
                new ArrayList<List<String>>();
        ls.add(new ArrayList<String>());

        //ls.add(new ArrayList<Integer>());

        ls.get(0).add("Array of Generics");
        System.out.println(ls.toString());
    }
}

