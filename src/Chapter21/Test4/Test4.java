package Chapter21.Test4;

import Chapter21.Test4.Fibonacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:YiMing
 * @create:2020/9/20,19:17
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println("---------------cachedThreadPool----------");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 1; i <= 5; i++)
            cachedThreadPool.execute(new Fibonacci(i));
        cachedThreadPool.shutdown();
        System.out.println("--------fixedThreadPool--------");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        for (int i = 1; i <= 5; i++)
            fixedThreadPool.execute(new Fibonacci(i));
        fixedThreadPool.shutdown();
    }
}
