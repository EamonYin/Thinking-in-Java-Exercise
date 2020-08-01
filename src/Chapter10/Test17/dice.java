package Chapter10.Test17;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/7/28,21:24
 * @version:1.0
 */
public class dice implements tossing {
    Random rand = new Random(47);
    public int surface(){
        return rand.nextInt(7);
    }
    tossingFactory t = new tossingFactory(){
        @Override
        public tossing getTossing() {
            return new dice();
        }
    };
}
