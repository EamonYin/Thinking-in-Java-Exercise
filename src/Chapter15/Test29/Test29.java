package Chapter15.Test29;

import java.util.ArrayList;
import java.util.List;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/26,20:50
 * @version:1.0
 */
public class Test29 {
    static void f1(Holder<List<?>> holder) {
        List<?> list = holder.get();
        print(holder.equals(list));
        // Compile errors:
        // list.add(1);
        // list.add(new Object());
        Integer i = (Integer)list.get(0);
        print(i);
        print(list.contains(i));
        print(list.remove(i));
        holder.set(new ArrayList<Float>());
    }

    static void f2(List<Holder<?>> list) {
        Holder<?> holder = (Holder<?>)list.get(0);
        print(holder.equals(Integer.valueOf(1)));
        // Compile error:
        // holder.set(new Integer(2));
        print(holder.get());
        list.add(new Holder<Float>(1.0F));
        print(list.get(1).get());
        list.remove(0);
        print(list.size());
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        f1(new Holder<List<?>>(list1));
        System.out.println("_____________________________");
        List<Holder<?>> list2 = new ArrayList<Holder<?>>();
        list2.add(new Holder<Integer>(1));
        f2(list2);
    }
}
