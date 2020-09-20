package Chapter21.Test2;

/**
 * @author:YiMing
 * @create:2020/9/20,18:30
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            new Thread(new Fibonacci(i)).start();
    }
}
