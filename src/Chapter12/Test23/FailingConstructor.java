package Chapter12.Test23;

import Chapter12.Test22.ConstructionException;

/**
 * @author:YiMing
 * @create:2020/8/13,20:15
 * @version:1.0
 */
public class FailingConstructor {
    private final WithDispose wd1, wd2;

    FailingConstructor(boolean fail) throws ConstructionException {
        wd1 = new WithDispose(1);
        try {
            if (fail) throw new ConstructionException();
        } catch (ConstructionException e) {
            wd1.dispose();
            throw e;
        }
        wd2 = new WithDispose(2);
    }
}
