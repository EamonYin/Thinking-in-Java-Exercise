package Chapter12.Test25;

/**
 * @author:YiMing
 * @create:2020/8/14,14:54
 * @version:1.0
 */
public class C extends B{
    @Override
    public void AThrow() throws CException {
        throw new CException("this is C");
    }
}
