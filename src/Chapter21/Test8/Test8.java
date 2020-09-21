package Chapter21.Test8;

import java.util.concurrent.TimeUnit;

/**
 * @author:YiMing
 * @create:2020/9/21,17:20
 * @version:1.0
 */
public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Waiting for SimpleThread");
        for (int i = 0; i < 5; i++) {
            SimpleThread simpleThread = new SimpleThread();
            Thread thread = new Thread(simpleThread);
            thread.setDaemon(true);
            thread.start();
        }
        TimeUnit.SECONDS.sleep(10);//10S非后台进程main结束，SimpleThread.run(){while (true)}结束
    }
}
