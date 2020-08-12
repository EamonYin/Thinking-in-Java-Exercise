package Chapter12.Test13;

/**
 * @author:YiMing
 * @create:2020/8/12,13:13
 * @version:1.0
 */
public class Test13 {
    static final String s = null;

    public static void main(String[] args) {
        try{
            if(s.length()>10){
                System.out.println("进来了");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally");
        }

    }
}
