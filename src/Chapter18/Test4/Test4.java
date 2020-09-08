package Chapter18.Test4;

import net.mindview.util.Directory;

import java.io.File;

/**
 * @author:YiMing
 * @create:2020/9/8,15:14
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        long length=0;
        for (File file:Directory.walk("./src/Chapter18/Test3",".*\\.java").files)
            length+=file.length();
        System.out.println(length);

    }
}
