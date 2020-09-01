package Chapter17.Test4;

import net.mindview.util.*;

import java.util.*;
/**
 * @author:YiMing
 * @create:2020/9/1,20:16
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        String[] s= TextFile.read("G:\\Java编程思想的一些练习\\Exercise\\src\\Chapter17\\Test4\\Test4.java").split("\\W+");
        Set<String> se=new LinkedHashSet<String>(Arrays.asList(s));
        Print.print(se);
    }
}
