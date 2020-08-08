package Chapter11.Test30;

import typeinfo.pets.*;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author:YiMing
 * @create:2020/8/8,18:40
 * @version:1.0
 */
public class InterfaceVsIterator {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.print(p.id() + ":" + p + " ");
        }
        System.out.println();
    }

    public static void display(Collection<Pet> pets) {
        for (Pet p : pets)
            System.out.print(p.id() + ":" + p + " ");
        System.out.println();
    }
}
