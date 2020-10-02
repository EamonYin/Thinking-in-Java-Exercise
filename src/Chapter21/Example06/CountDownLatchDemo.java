package Chapter21.Example06;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.*;

/**
 * @author:YiMing
 * @create:2020/9/26,19:58
 * @version:1.0
 */

/**CountDownLatch定义：
 * CountDownLatch是一个计数器，在它的构造方法中需要指定一个值，用来设定计数的次数。
 * 每调用一次countDown()方法，数值便会减一，CountDownLatch会一直阻塞着调用await()方法的线程，直到计数器的值变为0。*/

/**例题：
 * 设想有这样一个功能需要Thread1、Thread2、Thread3、Thread4四条线程分别统计C、D、E、F
 * 四个盘的大小，所有线程都统计完毕交给主线程去做汇总，利用CountDownLatch来完成就非常轻松。*/
public class CountDownLatchDemo {
    /**
     *
     */
    private static CountDownLatch countDownLatch = new CountDownLatch(4);

    /**
     * 线程池
     */
    private static ExecutorService executor = Executors.newFixedThreadPool(4);

    /**
     * 开启的线程数
     */
    private static int THREAD_COUNT = 4;


    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < THREAD_COUNT; i++) {
            executor.execute(new Runnable() {
                public void run() {
                    try {
                        // 模拟业务逻辑的耗时
                        int timer = new Random().nextInt(5);
                        TimeUnit.SECONDS.sleep(timer);

                        System.out.printf("%s时完成磁盘的统计任务,耗费%d秒.\n", new Date().toString(), timer);
                        // 业务处理完成之后,计数器减一
                        countDownLatch.countDown();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }

        // 主线程一直被阻塞,直到countDownLatch的值为0
        countDownLatch.await();
        System.out.printf("%s时全部任务都完成,执行合并计算.\n", new Date().toString());
        executor.shutdown();
    }

}

