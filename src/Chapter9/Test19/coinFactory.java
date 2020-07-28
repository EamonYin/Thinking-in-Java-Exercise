package Chapter9.Test19;

/**
 * @author:YiMing
 * @create:2020/7/28,21:21
 * @version:1.0
 */
public class coinFactory implements tossingFactory {
    public tossing getTossing() {
        return new coin();
    }
}
