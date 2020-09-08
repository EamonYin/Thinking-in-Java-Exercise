package Chapter18.Test2;

import java.io.File;
import java.io.IOException;

/**
 * @author:YiMing
 * @create:2020/9/8,13:44
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("./src/Chapter18/Test2");
        File filePath = new File(file.getCanonicalPath());
        SortedDirList sortedDirList = new SortedDirList(filePath);
        System.out.println(sortedDirList.list(".*\\.java"));
    }
}
