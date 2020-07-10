package Chapter5.Test12;

/**
 * @author:YiMing
 * @create:2020/7/6,18:15
 * @version:1.0
 */
public class Tank {
    static String strEmpty = "空的";
    String flag = "满的";

    void FlagEmpty() {
        flag = strEmpty;
    }

    @Override
    protected void finalize() throws Throwable {
        if (strEmpty.equals(flag)) {
            System.err.println("flag内容为:'" + flag + "'执行finalize");
            super.finalize();
        } else {
            System.err.println("flag内容为:'" + flag + "'不执行finalize");
        }
    }
}
