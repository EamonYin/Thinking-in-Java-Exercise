package Chapter21.Test12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:YiMing
 * @create:2020/9/23,17:22
 * @version:1.0
 */
public class Test12 {
    public static void main(String[] args) {
        System.out.println("Press Control-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        AtomicityTest at = new AtomicityTest();
        exec.execute(at);
        while (true) {
            int val = at.getValue();
            if (val % 2 != 0) {
                System.out.println(val);
                System.exit(0);
            }
        }
    }
}
