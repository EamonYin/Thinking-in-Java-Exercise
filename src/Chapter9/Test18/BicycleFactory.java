package Chapter9.Test18;

/**
 * @author:YiMing
 * @create:2020/7/28,20:55
 * @version:1.0
 */
public class BicycleFactory implements CycleFactory{
    public Bicycle getCycle() { return new Bicycle(); }
}
