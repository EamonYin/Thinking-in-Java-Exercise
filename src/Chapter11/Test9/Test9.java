package Chapter11.Test9;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {

        ArrayList<Rodent> rodents1 = new ArrayList<>();
        rodents1.add(new Gerbil());
        rodents1.add(new Hamster());
        rodents1.add(new Mouse());

        Iterator<Rodent> iterator = rodents1.iterator();
        while (iterator.hasNext()){
            Rodent next = iterator.next();
            next.hop();
            next.reproduce();
            next.scurry();
        }
    }
}
