package Chapter16.Test9;

/**
 * @author:YiMing
 * @create:2020/8/30,18:12
 * @version:1.0
 */
public class Banana {
    private final int id;
    Banana(int id) { this.id = id; }
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
