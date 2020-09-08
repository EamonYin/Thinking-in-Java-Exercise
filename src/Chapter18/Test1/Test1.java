package Chapter18.Test1;

import net.mindview.util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author:YiMing
 * @create:2020/9/8,12:05
 * @version:1.0
 */
public class Test1 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                private String ext = args[0].toLowerCase();

                public boolean accept(File dir, String name) {
                    //只分析具有指定扩展名的源文件（作为第一个命令行参数）
                    if (name.toLowerCase().endsWith(ext)) {
                        // 只过滤文件拓展名
                        if (args.length == 1)
                            return true;
                        Set<String> words = new HashSet<String>(new TextFile(new File(dir, name).getAbsolutePath(), "\\W+"));
                        for (int i = 1; i < args.length; i++)
                            if (words.contains(args[i]))
                                return true;
                    }
                    return false;
                }
            });
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String dirItem : list)
            System.out.println(dirItem);
    }
}
