package Chapter18.Test2;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/9/8,13:39
 * @version:1.0
 */
public class SortedDirList {
    String[] ss;
    public SortedDirList(File path){
        ss=path.list();
        Arrays.sort(ss);
    }
    public String[] list(){
        return ss;
    }
    public List<String> list(String regex){
        List<String> ls=new ArrayList<String>();
        for(int i=0;i<ss.length;i++){
            if(Pattern.compile(regex).matcher(ss[i]).matches())ls.add(ss[i]);
        }
        return ls;
    }
}
