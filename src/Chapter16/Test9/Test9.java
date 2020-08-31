package Chapter16.Test9;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/8/30,18:13
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {
        //不能创建泛型数组
        //Peel<Banana>[] a = new Peel<Banana>[10];
        ArrayList<Peel<Banana>> a = new ArrayList<Peel<Banana>>();
        for (int i = 0; i < 10; i++)
            a.add(new Peel<Banana>(new Banana(i)));
        for (Peel<Banana> p : a)
            p.peel();
    }
}
