package Chapter7.Test1.officialVersion;

/**
 * @author:YiMing
 * @create:2020/7/15,18:01
 * @version:1.0
 */
public class Second {
    Simple simple;
    String s;

    public Second(String str) {
        s = str;
    }

    public void check() {
        if (simple == null) { //非基本类型的对象引用，会被初始化为 null
            System.out.println("Simple 没有被初始化");
        } else {
            System.out.println("Simple 已经被初始化");
        }
    }

    private Simple lazy() {
        if (simple == null) {
            System.out.println("创建Simple。。。");
            simple = new Simple(s);
        }
        return simple;
    }

    public Simple getSimple() {
        return lazy();
    }

    public String toString() {
        return lazy().toString();
    }

    public void setSimple(String newStr) {
        lazy().setString(newStr);
    }
}
