package Chapter12.Test4;

/**
 * @author:YiMing
 * @create:2020/8/9,20:02
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {

        try {
            throw new MyException("出现了MyException异常");
        } catch (MyException me) {
            me.getProblem();
        }
    }
}
