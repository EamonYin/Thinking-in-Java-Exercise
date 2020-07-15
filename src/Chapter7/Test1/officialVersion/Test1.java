package Chapter7.Test1.officialVersion;

/**
 * @author:YiMing
 * @create:2020/7/15,19:02
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Second second = new Second("New String");
        second.check();
        System.out.println(second.getSimple());
        second.check();
        System.out.println(second);
        second.setSimple("New String Two");
        System.out.println(second);
    }
}
