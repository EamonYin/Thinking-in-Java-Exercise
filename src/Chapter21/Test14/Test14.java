package Chapter21.Test14;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * @author:YiMing
 * @create:2020/9/23,19:54
 * @version:1.0
 */
public class Test14 {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("Usage: java E14_ManyTimers <num of timers>");
        }
        int numOfTimers = Integer.parseInt(args[0]);
        for (int i = 0; i < numOfTimers; i++) {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(System.currentTimeMillis());
                }
            }, numOfTimers - i);
        }
        // Wait for timers to expire
        TimeUnit.MILLISECONDS.sleep(2 * numOfTimers);
        System.exit(0);
    }
}
