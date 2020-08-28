package Chapter15.Test38;

/**
 * @author:YiMing
 * @create:2020/8/28,16:52
 * @version:1.0
 */
public class BasicCoffee {
    private static long counter = 0;
    private final long id = counter++;
    private String value;
    public void set(String val) { value = val; }
    public String get() { return value; }
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
