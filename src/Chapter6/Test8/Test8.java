package Chapter6.Test8;

/**
 * @author:YiMing
 * @create:2020/7/14,21:17
 * @version:1.0
 */
public class Test8 {
    public static void main(String[] args) {
        ConnectionManager.Connections();
        for(int i = 0 ; i < 7 ; i++){
            Connection connection = ConnectionManager.GetConnection();
            System.out.println(connection);
        }
    }
}
