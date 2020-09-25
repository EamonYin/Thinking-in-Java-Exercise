package Chapter18.Test19;

import net.mindview.util.BinaryFile;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * @author:YiMing
 * @create:2020/9/9,19:28
 * @version:1.0
 */
public class Test19 {
    public static void main(String[] args) throws IOException {
        Map<Byte, Integer> bytesStat = new HashMap<Byte, Integer>();
        for (Byte bt : BinaryFile.read(new File("./src/Chapter18/Chapter21.Test17.Chapter21.Test17/C18T17测试文件.txt"))) {
            Integer freq = bytesStat.get(bt);
            bytesStat.put(bt, freq == null ? 1 : freq + 1);
        }
        List<Byte> keys = new ArrayList<Byte>(bytesStat.keySet());
        Collections.sort(keys);
        for (Byte key : keys) {
            System.out.println(key + " => " + bytesStat.get(key));
        }
    }
}
