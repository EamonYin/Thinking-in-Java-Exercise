package Chapter7.Test23;

/**
 * @author:YiMing
 * @create:2020/7/21,16:17
 * @version:1.0
 */
public class Test23 {
    public static void main(String[] args) {
        System.out.println("调用LoadTest静态方法");
        LoadTest.StaticMember();
        System.out.println("加载类的动作只执行一次，所以下面应该为空");
        new LoadTest();
        System.out.println("__________end_________");
    }
}
