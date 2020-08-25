package Chapter15.Test22;

import java.lang.reflect.InvocationTargetException;

/**
 * @author:YiMing
 * @create:2020/8/25,17:20
 * @version:1.0
 */
public class ClassB<T> {
    T x;
    public ClassB(Class<?> kind,Integer i,String typename){
        try {
            System.out.println(Class.forName(typename).getDeclaredConstructor(i.getClass()).newInstance(i));
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
