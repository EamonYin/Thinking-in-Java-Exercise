package Chapter12.Test27;

/**
 * @author:YiMing
 * @create:2020/8/9,19:48
 * @version:1.0
 */
public class Test27 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println("定义的数组长度："+arr.length);

        try {
            for (int i = 0; i < 4; i++) {
                arr[i] = i;
            }
        } catch (Exception e) {
            System.out.println("导致错误："+e);
            throw new RuntimeException(e);
        }


    }
}
