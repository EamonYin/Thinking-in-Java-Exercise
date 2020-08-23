package Chapter15.Test18;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

import net.mindview.util.Generator;

import static Chapter15.Test18.BigFish.generator;

/**
 * @author:YiMing
 * @create:2020/8/23,19:30
 * @version:1.0
 */
public class Test18 {
    public static void eat(BigFish bf, LittleFish lf) {
        System.out.println(bf + " eat " + lf);
    }

    public static void main(String[] args) {
        Random random = new Random(47);
        LinkedList<BigFish> bigFish = new LinkedList<>();
        Generators.fill(bigFish, BigFish.generator, 15);
        ArrayList<LittleFish> littleFish = new ArrayList<>();
        Generators.fill(littleFish, LittleFish.generator(), 4);
        for (BigFish bf : bigFish) {
            eat(bf, littleFish.get(random.nextInt(littleFish.size())));
        }
    }
}
