package Chapter11.Test8;

import Chapter10.Test20.Nested;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author:YiMing
 * @create:2020/8/5,17:54
 * @version:1.0
 */
public class Test8 {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++)
        {gerbils.add(new Gerbil(i));}
        Iterator<Gerbil> iterator = gerbils.iterator();
        while (iterator.hasNext()){
            Gerbil next = iterator.next();
            next.hop();
        }
    }
}
