package Chapter3;

/**
 * 移位运算
 * @author:YiMing
 * @create:2020/6/30,14:45
 * @version:1.0
 */
public class URShift {
    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));

        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        long l = -1;
        System.out.println(Long.toBinaryString(l));

        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println(Integer.toBinaryString(s));

        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));

        byte b= -1;
        System.out.println(Integer.toBinaryString(b));

        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));

        b=-1;
        System.out.println(Integer.toBinaryString(b>>>10));

    }
}
