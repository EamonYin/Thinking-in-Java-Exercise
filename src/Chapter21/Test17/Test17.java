package Chapter21.Test17; /**
 * @author:YiMing
 * @create:2020/9/24,15:54
 * @version:1.0
 */

import java.util.concurrent.*;
import java.util.*;

import static net.mindview.util.Print.*;

class Count {
    private int count = 0;
    private Random rand = new Random(47);

    // 删除synchronized关键字以查看计数失败：
    public synchronized int increment() {
        int temp = count;
        if (rand.nextBoolean()) // Yield half the time
            Thread.yield();
        return (count = ++temp);
    }

    public synchronized int value() {
        return count;
    }
}

class Sensor implements Runnable {
    private static Random rand = new Random(47);
    private static Count count = new Count();
    private static List<Sensor> sensors = new ArrayList<Sensor>();
    private int number;
    private final int id;
    private static volatile boolean canceled = false;

    public static void cancel() {
        canceled = true;
    }

    public Sensor(int id) {
        this.id = id;
        sensors.add(this);
    }

    public void run() {
        while (!canceled) {
            // 模拟电离事件的随机发生
            if (rand.nextInt(5) == 0) {
                synchronized (this) {
                    ++number;
                }
                count.increment();
            }
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                print("sleep interrupted");
            }
        }
    }

    public synchronized int getValue() {
        return number;
    }

    public String toString() {
        return "Sensor " + id + ": " + getValue();
    }

    public static int getTotalCount() {
        return count.value();
    }

    public static int sumSensors() {
        int sum = 0;
        for (Sensor sensor : sensors)
            sum += sensor.getValue();
        return sum;
    }
}

public class Test17 {
    public static void main(String[] args) throws Exception {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++)
            exec.execute(new Sensor(i));
        TimeUnit.SECONDS.sleep(3);
        Sensor.cancel();
        exec.shutdown();
        if (!exec.awaitTermination(250, TimeUnit.MILLISECONDS))
            print("某些任务未终止！");
        print("Total: " + Sensor.getTotalCount());
        print("Sum of Sensors: " + Sensor.sumSensors());
    }
}
