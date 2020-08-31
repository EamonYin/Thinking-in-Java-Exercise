package Chapter16.Test7;

/**
 * @author:YiMing
 * @create:2020/8/30,15:12
 * @version:1.0
 */
public class BerylliumSphere {
    private static long couter;
    private final long id = couter++;

    public String toString() {
        return "Sphere " + id;
    }
}
