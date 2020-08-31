package Chapter16.Test21;

import typeinfo.pets.Pet;

import java.util.Comparator;

/**
 * @author:YiMing
 * @create:2020/8/31,20:06
 * @version:1.0
 */
public class CompareWith implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return (o1 < o2 ? 1 : (o1==o2 ? 0 : -1));
    }

}
