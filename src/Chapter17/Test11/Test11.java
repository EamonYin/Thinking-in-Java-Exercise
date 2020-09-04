package Chapter17.Test11;

import java.util.PriorityQueue;

/**
 * @author:YiMing
 * @create:2020/9/3,15:01
 * @version:1.0
 */
public class Test11 {
    public static void main(String[] args) {
        PriorityQueue<Item> items = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            items.add(new Item());
        }

//        方法1：
//        Item it;
//        while ((it = items.poll()) != null)
//            System.out.println(it);

//        方法2：
        for (int j = 0; j < 10; j++) {
            System.out.println(items.remove());
        }
    }
}
