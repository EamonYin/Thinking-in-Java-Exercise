package Chapter12.Test29;

/**
 * @author:YiMing
 * @create:2020/8/14,19:08
 * @version:1.0
 */
public class StormyInning extends Inning implements Storm{
    StormyInning() {}
    StormyInning(String s) {}
    public void rainHard() {}
    void atBat() { throw new PopFoul(); }
}
