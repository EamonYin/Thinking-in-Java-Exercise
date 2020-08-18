package Chapter14.Test2;

/**
 * @author:YiMing
 * @create:2020/8/18,17:33
 * @version:1.0
 */
public class Test2 {
    static void printInfo(Class<?> cc) {
        System.out.println("Class name: " + cc.getName() +
                " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name : " + cc.getCanonicalName());
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("Chapter14.Test2.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            return;
        }
        printInfo(c);
        for (Class<?> face : c.getInterfaces())
            printInfo(face);
        Class<?> up = c.getSuperclass();
        Object obj = null;
        try {
            // newInstance()只能调用无参的构造函数，而使用new关键字生成对象没有这个限制
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            return;
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            return;
        }
        printInfo(obj.getClass());
    }
}
