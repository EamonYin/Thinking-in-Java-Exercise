package Chapter11.Test14;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author:YiMing
 * @create:2020/8/5,20:56
 * @version:1.0
 */
public class Test14 {

    public LinkedList<Integer> addMiddle(LinkedList<Integer> ll, Integer[] a) {

        for (Integer i : a) {
            ListIterator<Integer> integerListIterator = ll.listIterator(ll.size() / 2);
            integerListIterator.add(i);
        }
        return ll;
    }

    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        Integer[] a = {1,2,3,4,5,6};

        Test14 test14 = new Test14();
        System.out.println(test14.addMiddle(integers,a));
    }
}
