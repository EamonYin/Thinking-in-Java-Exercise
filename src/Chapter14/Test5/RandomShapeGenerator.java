package Chapter14.Test5;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/8/18,18:18
 * @version:1.0
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public RandomShapeGenerator() {
    }

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
