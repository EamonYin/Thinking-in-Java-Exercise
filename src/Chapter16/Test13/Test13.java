package Chapter16.Test13;

import Chapter16.Test12.ConvertTo;
import Chapter16.Test12.CountingGenerator;
import net.mindview.util.Generated;

import java.lang.reflect.Array;

/**
 * @author:YiMing
 * @create:2020/8/31,16:09
 * @version:1.0
 */
public class Test13 {
    public static void main(String[] args) {
//        ConvertTo.primitive(Generated.array(String.class,new CountingGenerator.Character(),15));
        String next = new CountingGenerator.String(15).next();
        System.out.println(next);
    }
}
