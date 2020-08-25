package Chapter15.Test25;

/**
 * @author:YiMing
 * @create:2020/8/25,20:28
 * @version:1.0
 */
public class TopLowImpl implements Top,Low{
    @Override
    public void c() {
        System.out.println("Low::c()");
    }

    @Override
    public void d() {
        System.out.println("Low::d()");
    }

    @Override
    public void a() {
        System.out.println("Top::a()");
    }

    @Override
    public void b() {
        System.out.println("Top::b()");
    }
}
