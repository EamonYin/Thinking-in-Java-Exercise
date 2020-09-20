package Chapter21.Test5;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * @author:YiMing
 * @create:2020/9/20,20:15
 * @version:1.0
 */
public class Test5 {


    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<Integer>> results = new ArrayList<Future<Integer>>();

        for (int i = 1; i <= 5; i++)
            results.add(exec.submit(new FibonacciSum(i)));
        Thread.yield();
        exec.shutdown();
        for (
                Future<Integer> fi : results)
            try {
                System.out.println(fi.get());
            } catch (
                    Exception e) {
                e.printStackTrace();
            }
    }
}
