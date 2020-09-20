package Chapter21.Test6;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @author:YiMing
 * @create:2020/9/20,20:40
 * @version:1.0
 */
public class SleepTask implements Runnable {

    private static Random random = new Random();
    private final int time = random.nextInt(10) + 1;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(time);
        } catch (InterruptedException e) {
            System.err.println("Interrupted: " + e);
        }
        System.out.println("Time:" + time + " s");
    }
}
