package Chapter17.Test7;

import net.mindview.util.Countries;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author:YiMing
 * @create:2020/9/2,18:14
 * @version:1.0
 */
public class Test7 {
    public static void main(String[] args) {
        List<String> ll = new LinkedList<String>(Countries.names(6));
        List<String> al = new ArrayList<String>(Countries.names(6));
        ListIterator<String> lit = ll.listIterator();
        ListIterator<String> lit2 = al.listIterator();
        while (lit.hasNext()) {
            lit.next();
            if (lit.hasNext()) {
                lit.add("+"+lit2.next());
            } else {
                lit.add("++"+lit2.next());
                break;
            }
        }
        System.out.println(ll);
    }


}
