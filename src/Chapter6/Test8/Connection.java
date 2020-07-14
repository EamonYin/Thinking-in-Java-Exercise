package Chapter6.Test8;

/**
 * @author:YiMing
 * @create:2020/7/14,20:58
 * @version:1.0
 */
public class Connection {
    private Connection() {
    }

    private static Connection c = new Connection();//(单例模式，只创建Connection的一个对象c)

    public static Connection NewConnection() {

        //return c;//(单例模式，只创建Connection的一个对象c)

        return new Connection();
    }
}
