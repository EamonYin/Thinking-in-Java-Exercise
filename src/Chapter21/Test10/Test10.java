package Chapter21.Test10;

import java.util.ArrayList;
import java.util.concurrent.Future;

/**
 * @author:YiMing
 * @create:2020/9/21,18:55
 * @version:1.0
 */
public class Test10 {
    public static void main(String[] args) {
        ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();
        FibonacciSum2.init();
        for (int i = 1; i <= 5; i++)
            results.add(FibonacciSum2.runTask(i));
        Thread.yield();
        FibonacciSum2.shutdown();
        for (Future<Integer> fi : results)
            try {
                System.out.println(fi.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}
