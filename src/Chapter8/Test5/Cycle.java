package Chapter8.Test5;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/7/21,19:13
 * @version:1.0
 */
public class Cycle {
    public void Test(){
        System.out.println(Ride.CYCLE);
    }

    int wheels(){
        Random random = new Random();
        return random.nextInt(3);
    }
}
