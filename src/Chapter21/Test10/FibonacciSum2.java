package Chapter21.Test10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author:YiMing
 * @create:2020/9/21,18:54
 * @version:1.0
 */
public class FibonacciSum2 {
    private static ExecutorService exec;

    private static int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static synchronized Future<Integer> runTask(final int n) {
        assert exec != null;
        return exec.submit(new Callable<Integer>() {
            public Integer call() {
                int sum = 0;
                for (int i = 0; i < n; i++)
                    sum += fib(i);
                return sum;
            }
        });
    }

    public static synchronized void init() {
        if (exec == null)
            exec = Executors.newCachedThreadPool();
    }

    public static synchronized void shutdown() {
        if (exec != null)
            exec.shutdown();
        exec = null;
    }
}