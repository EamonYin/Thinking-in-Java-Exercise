package Chapter21.Test9;

/**
 * @author:YiMing
 * @create:2020/9/21,17:45
 * @version:1.0
 */
public class SimplePriorities2 implements Runnable {
    private int countDown = 5;
    private volatile double d; // No optimization

    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    public void run() {
        for (; ; ) {
            // An expensive, interruptable operation:
            for (int i = 1; i < 100000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0)
                    Thread.yield();
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }
}
