package Chapter4;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/7/3,19:19
 * @version:1.0
 */
public class SwitchTest {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int c = random.nextInt(5);
            switch (c) {
                case 1:
                    System.out.println(c);
//                    break;
                case 2:
                    System.out.println(c);
                    break;
                case 3:
                    System.out.println(c);
                    break;
                default:
                    System.out.println("不是1，2，3是：" + c);
            }
        }
    }
}
