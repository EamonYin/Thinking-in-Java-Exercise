package Chapter6.Test8;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/7/14,20:42
 * @version:1.0
 */
public class ConnectionManager {

    private ConnectionManager() {
    }

    private static ArrayList<Connection> conn = new ArrayList<Connection>();

    public static void Connections() {
        for (int i = 0; i < 5; i++) {
            conn.add(Connection.NewConnection());
        }
    }

    public static Connection GetConnection() {
        if (conn.size() > 0) {
            for (Connection c : conn) {
                /*
                 * 因为GetConnection方法是static的，每一次都是从数组的第0个开始取值，
                 * 所以每一次都要remove第一个
                 */
                conn.remove(0);
                return c;
            }
        }
        return null;
    }

}
