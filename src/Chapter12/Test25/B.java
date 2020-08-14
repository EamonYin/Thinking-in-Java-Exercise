package Chapter12.Test25;

/**
 * @author:YiMing
 * @create:2020/8/14,14:54
 * @version:1.0
 */
public class B extends A{
    @Override
    public void AThrow() throws BException {
        throw new BException("this is B");
    }
}
