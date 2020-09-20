package Chapter21.Test5;

import net.mindview.util.Generator;

import java.util.concurrent.Callable;

/**
 * @author:YiMing
 * @create:2020/9/20,20:13
 * @version:1.0
 */
public class FibonacciSum implements Generator<Integer>, Callable<Integer> {
    private int count;
    private final int n;

    public FibonacciSum(int n) {
        this.n = n;
    }

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public Integer call() {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += next();
        return sum;
    }
}