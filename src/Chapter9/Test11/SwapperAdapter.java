package Chapter9.Test11;

/**
 * @author:YiMing
 * @create:2020/7/26,21:14
 * @version:1.0
 */
public class SwapperAdapter implements Processor{
    public String name() {
        return GetString.class.getSimpleName();
    }
    public String process(Object input) {
        return GetString.getString((String)input);
    }

}
