package Chapter11.Test1;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/8/3,20:35
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<Gerbil>();
        for (int i = 0; i < 10; i++)
            gerbils.add(new Gerbil(i));
        for (int i = 0; i < gerbils.size(); i++)
            gerbils.get(i).hop();
    }
}
