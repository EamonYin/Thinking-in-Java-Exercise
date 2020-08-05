package Chapter11.Test12;

import Chapter7.Test7.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

/**
 * @author:YiMing
 * @create:2020/8/5,19:18
 * @version:1.0
 */
public class Test12 {



    public static void main(String[] args) {
        ArrayList<Empty> empties = new ArrayList<>();
        Empty[] a = {new Empty(1), new Empty(2), new Empty(3)};
        Collections.addAll(empties, a);

        ListIterator<Empty> emptyListIterator = empties.listIterator();
        while (emptyListIterator.hasNext()) {
            System.out.print(emptyListIterator.next() + " ");
        }
        System.out.println();
        while (emptyListIterator.hasPrevious())
            System.out.print(emptyListIterator.previous()+" ");
    }
}
