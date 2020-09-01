package Chapter17.Test3;

import net.mindview.util.Countries;
import net.mindview.util.Print;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author:YiMing
 * @create:2020/9/1,20:14
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args){
        Set<String> hs=new HashSet<String>(Countries.names(6));
        Set<String> ts=new TreeSet<String>(Countries.names(6));
        Set<String> ls=new LinkedHashSet<String>(Countries.names(6));
        Print.print(hs);
        Print.print(ts);
        Print.print(ls);
    }
}
