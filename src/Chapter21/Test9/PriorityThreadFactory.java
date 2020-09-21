package Chapter21.Test9;

import java.util.concurrent.ThreadFactory;

/**
 * @author:YiMing
 * @create:2020/9/21,17:45
 * @version:1.0
 */
public class PriorityThreadFactory implements ThreadFactory {
    private final int priority;

    PriorityThreadFactory(int priority) {
        this.priority = priority;
    }

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(priority);
        return t;
    }
}
