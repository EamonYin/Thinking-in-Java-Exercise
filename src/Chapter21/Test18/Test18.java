package Chapter21.Test18;

import java.util.concurrent.*;

/**
 * @author:YiMing
 * @create:2020/9/24,18:20
 * @version:1.0
 */
class NonTask {
    static void longMethod() throws InterruptedException {
        TimeUnit.SECONDS.sleep(60); // Waits one minute
    }
}

class Task implements Runnable {
    @Override
    public void run() {
        try {
            NonTask.longMethod();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        } finally {
            // Any cleanup code here...
        }
    }
}

public class Test18 {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Task());
        t.start();
        TimeUnit.SECONDS.sleep(1);
        t.interrupt();
    }
}
