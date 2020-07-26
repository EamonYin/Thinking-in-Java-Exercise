package Chapter9.Test11;

/**
 * @author:YiMing
 * @create:2020/7/26,21:17
 * @version:1.0
 */
public class Test11 {
    public static void main(String[] args) {
        Apply.process(new SwapperAdapter(),"1234");
        Apply.process(new SwapperAdapter(),"abcde");
    }
}
