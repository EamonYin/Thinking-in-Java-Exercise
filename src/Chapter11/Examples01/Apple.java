package Chapter11.Examples01;

/**
 * @author:YiMing
 * @create:2020/8/3,18:26
 * @version:1.0
 */
public class Apple {
    private static long counter;
    private final long id = counter++;
    public long id(){return id;}
}
