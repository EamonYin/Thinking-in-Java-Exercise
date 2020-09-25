package Chapter21.Test21;

import Chapter21.Test3.Run;

import java.util.concurrent.*;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/9/25,17:30
 * @version:1.0
 */

class run1 implements Runnable {
    public run1() {
        print("run1……");
    }

    @Override
    public void run() {
        print("run1 wait……");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        print("run1 exited wait");
    }
}

class run2 implements Runnable {
    Runnable Task1;

    public run2(Runnable otherTask) {
        this.Task1 = otherTask;
        print("run2……");
    }

    @Override
    public void run() {
        print("run2 睡 5 秒");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        print("run2 notifyAll");
        synchronized (Task1) {
            Task1.notify();
        }
    }
}

public class Test21 {
    public static void main(String[] args) {
        Runnable run01 = new run1(),
                run02 = new run2(run01);
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(run01);
        exec.execute(run02);
        Thread.yield();
        exec.shutdown();
    }

}
