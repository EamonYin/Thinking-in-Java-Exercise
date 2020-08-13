package Chapter12.Test21;

/**
 * @author:YiMing
 * @create:2020/8/13,20:03
 * @version:1.0
 */
public class Father {
    public Father() throws FatherException {
        throw new FatherException("this is fatherException");
    }
}
