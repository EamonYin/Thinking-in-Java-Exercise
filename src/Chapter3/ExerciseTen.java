package Chapter3;

/**
 * @author:YiMing
 * @create:2020/6/29,20:15
 * @version:1.0
 */
public class ExerciseTen {
    public static void main(String[] args) {
        final int constant1 = 0x2A;//-11010110
        final int constant2 = 0x15;//-11101011

        System.out.println("~constant1=  "+constant1);
        System.out.println("~constant2=  "+constant2);
        System.out.println("constant1 & constant2=  "+Integer.toBinaryString(constant1 & constant2));
        System.out.println("constant1 | constant2="+Integer.toBinaryString(constant1 | constant2));
        System.out.println("constant1 ^ constant2="+Integer.toBinaryString(constant1 ^ constant2));

        int i;
        i = constant1;
        i &= constant2;
        System.out.println("i &= constant2=  "+Integer.toBinaryString(i &= constant2));

        i = constant1;
        i |= constant2;
        System.out.println("i |= constant2=  "+Integer.toBinaryString(i |= constant2));

        i = constant1;
        i ^= constant2;
        System.out.println("i ^= constant2=  "+Integer.toBinaryString(i ^= constant2));
    }
}
