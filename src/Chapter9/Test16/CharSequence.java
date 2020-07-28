package Chapter9.Test16;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/7/27,21:35
 * @version:1.0
 */
public class CharSequence {
    private static Random rand = new Random(47);
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();
    char[] generate() {
        char[] buffer = new char[10];
        int idx = 0;
        buffer[idx++] = capitals[rand.nextInt(capitals.length)];
        for(int i = 0; i < 4; i++) {
            buffer[idx++] = vowels[rand.nextInt(vowels.length)];
            buffer[idx++] = lowers[rand.nextInt(lowers.length)];
        }
        buffer[idx] = ' ';
        return buffer;
    }
}
