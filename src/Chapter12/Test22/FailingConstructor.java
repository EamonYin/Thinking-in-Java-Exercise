package Chapter12.Test22;

/**
 * @author:YiMing
 * @create:2020/8/13,20:15
 * @version:1.0
 */
public class FailingConstructor {
    FailingConstructor(boolean fail) throws ConstructionException {
        if (fail) throw new ConstructionException();
    }
}
