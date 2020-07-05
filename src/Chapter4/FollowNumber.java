package Chapter4;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/7/2,18:44
 * @version:1.0
 */
public class FollowNumber {
    public static void main(String[] args) {
        int num1=0 , num2;
        for(int i = 1 ; i < 26;){
            Random random = new Random();
            num2 = random.nextInt(100);

            if(num1 == num2) System.out.println("第"+i+" 前一个数"+num1+" = 后一个数"+num2);
            if(num1 < num2) System.out.println("第"+i+" 前一个数"+num1+" < 后一个数"+num2);
            if(num1 > num2) System.out.println("第"+i+" 前一个数"+num1+" > 后一个数"+num2);

            num1 = num2;
            i++;
        }

    }
}
