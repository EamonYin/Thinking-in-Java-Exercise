package Chapter14.Test19;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

/**
 * @author:YiMing
 * @create:2020/8/20,22:15
 * @version:1.0
 */
public class Test19 {

    static Object printInfo(String toyName, int IQ) {
        //正则表达式删除路径名
        Pattern pattern = Pattern.compile("\\w+\\.");
        try {
            Class<?> aClass = Class.forName(toyName);
            //查找SuperToy中的方法
            Method[] methods = aClass.getMethods();
            for (Method method : methods) {
                String s = pattern.matcher(method.toString()).replaceAll("");
                System.out.println(s);
            }
            //有参构造器【public SuperToy(int intelligence,String str)】，构造SuperToy
            for (Constructor<?> constructor : aClass.getConstructors()) {
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int count = 1;
                for (Object o: parameterTypes) {
                    System.out.println("参数 "+count+":"+o);
                    count++;
                }
                return constructor.newInstance(new Object[]{Integer.valueOf(IQ), "有参构造器参数"});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void main(String[] args) {
        System.out.println(printInfo("Chapter14.Test19.toys.SuperToy", 150));
    }

}
