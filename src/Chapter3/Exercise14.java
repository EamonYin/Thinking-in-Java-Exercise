package Chapter3;

/**
 * @author:YiMing
 * @create:2020/7/1,19:56
 * @version:1.0
 */
public class Exercise14 {
    public static void Match1 (String str1 , String str2){
        System.out.println("str1 == str2 "+str1 == str2);
        System.out.println("str1 != str2 "+str1 != str2);
        System.out.println("str1 equals str2 "+str1.equals(str2));
    }

    public static void main(String[] args) {
        Match1("hello", "hello");
        System.out.println("+++++++++++++++++++");
        Match1("hello", new String("hello"));
        System.out.println("+++++++++++++++++++");
        Match1("hello", "kldsf");
        System.out.println("+++++++++++++++++++");
    }
}
