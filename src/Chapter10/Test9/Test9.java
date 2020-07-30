package Chapter10.Test9;

/**
 * @author:YiMing
 * @create:2020/7/30,21:11
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {

        ImplOuter implOuter = new ImplOuter();
        Outer outer = implOuter.getOuter();
        outer.IsOuter();
    }
}
