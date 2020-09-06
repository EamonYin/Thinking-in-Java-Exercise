package Chapter17.Test40;

import java.util.Comparator;

/**
 * @author:YiMing
 * @create:2020/9/6,20:38
 * @version:1.0
 */ //Test42按字母排序
public class CompareSecondAlphabetic implements Comparator<TwoString> {
    public int compare(TwoString sc1, TwoString sc2) {
        return sc1.s1.toLowerCase().compareTo(sc2.s1.toLowerCase());
    }
}
