package Chapter21.Test20;

/**
 * @author:YiMing
 * @create:2020/9/24,18:42
 * @version:1.0
 */
public class LiftOff2 implements Runnable {
    protected int countDown = 5000;
    private static int taskCount;
    private final int id = taskCount++;

    public LiftOff2() {
    }

    public LiftOff2(int countDown) {
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }

    public void run() {
        while (countDown-- > 0) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("Interrupted: #" + id);
                return;
            }
            System.out.print(status());
            Thread.yield();
        }
    }
}
