//: enumerated/cartoons/EnumImplementation.java
// An enum can implement an interface
package Chapter19.Test2;

import java.util.*;

import net.mindview.util.*;

enum CartoonCharacter
        /*implements Generator<CartoonCharacter>*/ {
    SLAPPY, SPANKY, PUNCHY, SILLY, BOUNCY, NUTTY, BOB;

    /*private Random rand = new Random(47);

    public CartoonCharacter next() {
        return values()[rand.nextInt(values().length)];
    }*/
    public static CartoonCharacter next() {
        Random rand = new Random();
        return values()[rand.nextInt(values().length)];
    }
}

/**
 * 使next（）方法成为静态的好处是不需要
 * 调用方法的枚举的实例。缺点是需要
 * 生成器无法接受CartonCharacter。
 */
public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.print(rg.next() + ", ");
    }

    public static void main(String[] args) {
        // Choose any instance:
        CartoonCharacter cc = CartoonCharacter.BOB;
        for (int i = 0; i < 10; i++)
            System.out.print(cc.next() + " ");
    }
} /* Output:
BOB, PUNCHY, BOB, SPANKY, NUTTY, PUNCHY, SLAPPY, NUTTY, NUTTY, SLAPPY,
*///:~
