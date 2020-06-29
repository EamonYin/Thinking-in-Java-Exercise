package Chapter3.Exercise0302;

import java.util.Random;

/**
 * @author:YiMing
 * @create:2020/6/29,16:58
 * @version:1.0
 */
public class MathOps {
    public static void main(String[] args) {

        int i,j,k;

        /*创建种子随机数生成器
         *无参构造每次生成的伪随机数都不同，设置seed（随机数种子）每次生成的随机数相同
         */
        Random rnd = new Random(47);

        //选择值在1~100
        j = rnd.nextInt(100)+1;
        System.out.println("j="+j);
        k = rnd.nextInt(100)+1;
        System.out.println("k="+k);




    }


}
