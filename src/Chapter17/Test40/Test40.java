package Chapter17.Test40;

import net.mindview.util.CollectionData;
import net.mindview.util.Generated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/9/6,20:25
 * @version:1.0
 */
public class Test40 {
    public static void main(String[] args) {
        TwoString[] array = new TwoString[10];
        Generated.array(array, TwoString.generator());
        print("before sorting, array = " + Arrays.asList(array));
        Arrays.sort(array);
        print("\nafter sorting, array = " + Arrays.asList(array));
        Arrays.sort(array, new CompareSecond());
        print("\nafter sorting with CompareSecond, array = " + Arrays.asList(array));
        ArrayList<TwoString> list = new ArrayList<TwoString>(CollectionData.list(TwoString.generator(), 10));
        TwoString zeroth = list.get(0);
        print("\nbefore sorting, list = " + list);
        Collections.sort(list);
        print("\nafter sorting, list = " + list);
        Comparator<TwoString> comp = new CompareSecond();
        Collections.sort(list, comp);
        print("\nafter sorting with CompareSecond, list = " + list);
        int index = Collections.binarySearch(list, zeroth, comp);
        print("\nFormer zeroth element " + zeroth + " now located at " + index);
    }
}
