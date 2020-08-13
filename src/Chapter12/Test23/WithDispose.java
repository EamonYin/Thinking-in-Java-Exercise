package Chapter12.Test23;

/**
 * @author:YiMing
 * @create:2020/8/13,20:24
 * @version:1.0
 */
public class WithDispose {
    private final int id;

    WithDispose(int id) {
        this.id = id;
    }

    void dispose() {
        System.out.println("WithDispose.dispose(): " + id);
    }
}
