package Chapter15.Test30;

import Chapter15.Test29.Holder;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/8/26,21:17
 * @version:1.0
 */
public class Test30 {
    public static void main(String[] args) {
        System.out.println("------------Integer→int---------------");
        Holder<Integer> integerHolder = new Holder<>();
        integerHolder.set(1);
        int i = integerHolder.get();
        print(i == 1);
        System.out.println("------------Byte→byte---------------");
        Holder<Byte> byteHolder = new Holder<>();
        byteHolder.set((byte) 1);
        Byte aByte = byteHolder.get();
        print(aByte == 1);
        System.out.println("------------Short→short---------------");
        Holder<Short> shortHolder = new Holder<Short>();
        shortHolder.set((short)1);
        short s = shortHolder.get();
        print(s == 1);
        System.out.println("------------Long→long---------------");
        Holder<Long> longHolder = new Holder<Long>();
        longHolder.set(1L);
        long l = longHolder.get();
        print(l == 1);
        System.out.println("------------Float→float---------------");
        Holder<Float> floatHolder = new Holder<Float>();
        floatHolder.set(1.0F);
        float f = floatHolder.get();
        print(f == 1.0F);
        System.out.println("------------Double→double---------------");
        Holder<Double> doubleHolder = new Holder<Double>();
        doubleHolder.set(1.0);
        double d = doubleHolder.get();
        print(d == 1.0);
        System.out.println("------------Character→char---------------");
        Holder<Character> characterHolder = new Holder<Character>();
        characterHolder.set('A');
        char c = characterHolder.get();
        print(c == 'A');
        System.out.println("------------Boolean→boolean---------------");
        Holder<Boolean> booleanHolder = new Holder<Boolean>();
        booleanHolder.set(true);
        boolean bool = booleanHolder.get();
        print(bool);
    }
}
