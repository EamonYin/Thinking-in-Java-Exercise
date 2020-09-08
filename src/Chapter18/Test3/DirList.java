package Chapter18.Test3;//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}

import java.util.regex.*;
import java.io.*;
import java.util.*;

public class DirList {

    public static void main(String[] args) throws IOException {
        File filePath = new File("./src/Chapter18/Test3");
        File path = new File(filePath.getCanonicalPath());
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        long total = 0;
        long fs;
        for (String dirItem : list) {
            fs = new File(path, dirItem).length();
            System.out.println(dirItem + ", " + fs + " byte(s)");
            total += fs;
        }
        System.out.println("=======================");
        System.out.println(list.length + " file(s), " + total + " bytes");
    }
}

class DirFilter implements FilenameFilter {
    private Pattern pattern;

    public DirFilter(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
} /* Output:
DirectoryDemo.java
DirList.java
DirList2.java
DirList3.java
*///:~
