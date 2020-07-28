package Chapter9.Test16;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @author:YiMing
 * @create:2020/7/27,21:36
 * @version:1.0
 */
public class Test16 extends CharSequence implements Readable {
    private int count;

    public Test16(int count) {
        this.count = count;
    }

    public int read(CharBuffer cb) {
        if (count-- == 0)
            return -1; // Indicates end of input
        char[] buffer = generate();
        cb.put(buffer);
        return buffer.length;
    }

    public static void main(String[] args) {
        Scanner s =
                new Scanner(new Test16(10));
        while (s.hasNext())
            System.out.println(s.next());
    }
}
