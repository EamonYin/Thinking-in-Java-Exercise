package Chapter10.Test17;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/7/28,21:19
 * @version:1.0
 */
public class coin implements tossing {
    Random rand = new Random(47);

    public int surface() {
        return rand.nextInt(2);
    }

   tossingFactory t = new tossingFactory(){
       @Override
       public tossing getTossing() {
           return new coin();
       }
   };
}
