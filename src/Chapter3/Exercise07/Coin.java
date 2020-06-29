package Chapter3.Exercise07;

import javax.swing.*;
import java.util.Random;

/**
 * 逻辑操作符
 * 模拟扔硬币
 * @author:YiMing
 * @create:2020/6/29,19:29
 * @version:1.0
 */
public class Coin {
    public static void main(String[] args) {
        Random random = new Random();
        int coin = random.nextInt(2);
        if(coin == 0) System.out.println("反面");
        else System.out.println("正面");
    }
}
