package Chapter15.Test8;

/**
 * @author:YiMing
 * @create:2020/8/22,21:30
 * @version:1.0
 */
public class Guy {
    private static int count = 0;
    private final int id = count++;

    public String toSting() {
        return getClass().getSimpleName() + "  " + id;
    }
}
