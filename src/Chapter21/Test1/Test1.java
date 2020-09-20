package Chapter21.Test1;

/**
 * @author:YiMing
 * @create:2020/9/20,18:28
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++)
            new Thread(new Run()).start();
    }
}
