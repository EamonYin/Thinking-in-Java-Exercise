package Chapter4;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/7/3,19:29
 * @version:1.0
 */
public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = Fibonacci(6);
        System.out.println(fibonacci);
    }
    public static ArrayList<Integer> Fibonacci(int num){
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(1);
        for (int i = 2 ; i < num ; i++){
            ints.add(ints.get(i-1)+ints.get(i-2));
        }
        return ints;
    }
}
