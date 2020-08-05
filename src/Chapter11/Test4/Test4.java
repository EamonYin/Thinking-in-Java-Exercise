package Chapter11.Test4;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/4,17:37
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        String[] strings = new String[10];
        ArrayList<String> al=new ArrayList<String>();
        LinkedList<String> ll=new LinkedList<String>();
        HashSet<String> hs=new HashSet<String>();
        LinkedHashSet<String> ls=new LinkedHashSet<String>();
        TreeSet<String> ts=new TreeSet<String>();

        String temp = null;
        Movie movie = new Movie();
        for (int i = 0 ; i < strings.length ; i++){
            temp = movie.next();
            strings[i] = temp;
            al.add(temp);
            ll.add(temp);
            hs.add(temp);
            ls.add(temp);
            ts.add(temp);
        }

        for (String str: strings) {
            System.out.print(str+" ");
        }
        System.out.println("");

        System.out.println(al);
        System.out.println(ll);
        System.out.println(hs);
        System.out.println(ls);
        System.out.println(ts);
    }
}
