package Chapter15.Test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/8/22,20:48
 * @version:1.0
 */
public class Test6<T> {
    private ArrayList<T> storage = new ArrayList<T>();
    private Random rand = new Random(47);

    public void add(T item) {
        storage.add(item);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }

    public static void main(String[] args) {
        Test6<Integer> rs = new Test6<Integer>();
        for (Integer s : Arrays.asList(4, 6, 87, 211, 76))//形成数组方法
            rs.add(s);
        for (int i = 0; i < 6; i++)
            System.out.print(rs.select() + " ");
    }

}
