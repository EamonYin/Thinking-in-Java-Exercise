package Chapter21.Test3;

import Chapter21.Test3.Run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author:YiMing
 * @create:2020/9/20,19:14
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++)
            executorService.execute(new Run());
        executorService.shutdown();
    }
}
