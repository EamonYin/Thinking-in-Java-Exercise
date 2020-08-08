package Chapter11.Test28;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/8/8,17:32
 * @version:1.0
 */
public class Test28 {
    public static void main(String[] args) {
        Random random = new Random();

        Queue<Integer> qd = new LinkedList<Integer>();

        for (int i =0 ; i < 10 ;i++){
            int randomNum = random.nextInt(10);
            qd.offer(randomNum);
        }

        System.out.println("Old:"+qd);

        System.out.println(qd.poll());

        System.out.println("New:"+qd);
    }
}
