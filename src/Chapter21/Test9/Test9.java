package Chapter21.Test9;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:YiMing
 * @create:2020/9/21,17:45
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool(
                new PriorityThreadFactory(Thread.MIN_PRIORITY));
        for (int i = 0; i < 5; i++)
            exec.execute(new SimplePriorities2());
        Thread.yield();
        exec.shutdown();
        exec = Executors.newCachedThreadPool(
                new PriorityThreadFactory(Thread.MAX_PRIORITY));
        exec.execute(new SimplePriorities2());
        Thread.yield();
        exec.shutdown();
    }
}
