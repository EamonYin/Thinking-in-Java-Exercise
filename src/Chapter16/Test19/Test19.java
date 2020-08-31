package Chapter16.Test19;

import Chapter7.Test14.Engine;

import java.util.Arrays;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/8/31,18:39
 * @version:1.0
 */
public class Test19 {
    public static void main(String[] args) {
        A[] a = {new A(1)};
        A[] b = {new A(1)};
        print(Arrays.equals(a, b));
        Arrays.fill(a, new Equals(1));
        Arrays.fill(b, new Equals(1));
        System.out.println("a:    "+a.length);
        System.out.println("b:    "+b.length);
        System.out.println(Arrays.equals(a, b));
    }

}
