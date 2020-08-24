package Chapter15.Test20;

/**
 * @author:YiMing
 * @create:2020/8/24,18:43
 * @version:1.0
 */
public class CombinedImpl implements Top {
    public void a() {
        System.out.println("Top::a()");
    }

    public void b() {
        System.out.println("Top::b()");
    }

    public void c() {
        System.out.println("CombinedImpl::c()");
    }
}
