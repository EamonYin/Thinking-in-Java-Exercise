package Chapter11.Test11;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/5,18:12
 * @version:1.0
 */
public class Test11 {

    public void Iterator1(Iterator<Object> it){
        while(it.hasNext()){
            Object next = it.next();
            System.out.println(next.toString());
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        int[] a = {1,2,3,4,5};
        Collections.addAll(al,a);
        LinkedList<Object> ll = new LinkedList<>(al);
        HashSet<Object> hl = new HashSet<>(al);
        Collection<Object> cl = new ArrayList<>(al);

        Test11 test11 = new Test11();
        test11.Iterator1(al.iterator());
        test11.Iterator1(ll.iterator());
        test11.Iterator1(hl.iterator());
        test11.Iterator1(cl.iterator());
    }


}
