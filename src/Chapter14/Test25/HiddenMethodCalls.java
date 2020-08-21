package Chapter14.Test25;

import java.lang.reflect.Method;

/**
 * @author:YiMing
 * @create:2020/8/21,21:27
 * @version:1.0
 */
public class HiddenMethodCalls {
    static void callHiddenMethod(Object a, String methodName) throws Exception{
        Method declaredMethod = a.getClass().getDeclaredMethod(methodName);
        declaredMethod.setAccessible(true);
        declaredMethod.invoke(a);
    }
}
