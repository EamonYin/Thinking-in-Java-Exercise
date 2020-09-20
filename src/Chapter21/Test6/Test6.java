package Chapter21.Test6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:YiMing
 * @create:2020/9/20,20:46
 * @version:1.0
 */
public class Test6 {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++)
            exec.execute(new SleepTask());
        Thread.yield();
        exec.shutdown();
    }
}
