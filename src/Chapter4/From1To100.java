package Chapter4;

/**
 * @author:YiMing
 * @create:2020/7/2,18:35
 * @version:1.0
 */
public class From1To100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            //if(i == 99) break;//当 i=99通过“break”跳出整个for循环
            System.out.print(i);
            if (i < 100) {
                System.out.print(",");
            }
        }
    }
}
