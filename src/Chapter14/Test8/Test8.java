package Chapter14.Test8;

/**
 * @author:YiMing
 * @create:2020/8/18,21:07
 * @version:1.0
 */
public class Test8 {
    static void f(Class c) {
        System.out.println(c.getName());
        try {
            System.out.println(c.getSuperclass());
        } catch (Exception e) {
            System.out.println(c.getName() + "没有基类");
        }
    }

    public static void main(String[] args) {
        if(args.length<1)
            System.exit(0);

        Class c = null;
        try {
            c = Class.forName(args[1]);
//            System.out.println(c.getName()+" "+c.isInterface());
            System.out.println(c.getDeclaredFields());
//            f(c);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
