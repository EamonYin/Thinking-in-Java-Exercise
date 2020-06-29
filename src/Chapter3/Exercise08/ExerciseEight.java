package Chapter3.Exercise08;

/**
 * @author:YiMing
 * @create:2020/6/29,19:56
 * @version:1.0
 */
public class ExerciseEight {
    public static void main(String[] args) {
        long num1 = 0xefef;//十六进制
        long num2 = 066657;//八进制

        System.out.println(Long.toBinaryString(num1));
        System.out.println(Long.toBinaryString(num2));
    }
}
