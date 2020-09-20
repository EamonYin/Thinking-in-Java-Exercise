package Chapter21.Test1;

/**
 * @author:YiMing
 * @create:2020/9/20,18:21
 * @version:1.0
 */
public class Run implements Runnable {
    private static int taskCount;
    private final int id = taskCount++;

    Run() {
        System.out.println("Printer started, ID = " + id);
    }

    @Override
    public void run() {
        System.out.println("Stage 1..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 2..., ID = " + id);
        Thread.yield();
        System.out.println("Stage 3..., ID = " + id);
        Thread.yield();
        System.out.println("Printer ended, ID = " + id);
    }
}
