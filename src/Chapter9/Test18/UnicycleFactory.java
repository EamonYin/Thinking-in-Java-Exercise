package Chapter9.Test18;

/**
 * @author:YiMing
 * @create:2020/7/28,20:54
 * @version:1.0
 */
public class UnicycleFactory implements CycleFactory{
    public Unicycle getCycle() { return new Unicycle(); }
}
