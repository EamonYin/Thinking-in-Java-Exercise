package Chapter15.Test39.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author:YiMing
 * @create:2020/8/28,17:40
 * @version:1.0
 */

//说话的能力
interface ISay {
    void say();
}

class SayImpl implements ISay {
    @Override
    public void say() {
        System.out.println("hello");
    }
}

//报时的能力
interface IDate {
    void now();
}

class DateImpl implements IDate {
    @Override
    public void now() {
        System.out.println(new Date());
    }
}

//唱歌的能力
interface ISing {
    void sing();
}

class SingImpl implements ISing {
    @Override
    public void sing() {
        System.out.println("lalalalalala!");
    }
}

class Mix implements InvocationHandler { //动态代理
    private Map<String, Object> delegates = new HashMap<>();

    public Mix(Object... args) {
        for (Object obj : args) {
            Class<?> clazz = obj.getClass();
            Method[] methods = clazz.getMethods();
            for (Method method : methods) {
                if (!delegates.containsKey(method.getName())) {
                    delegates.put(method.getName(), obj);
                }
            }
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object delegate = delegates.get(method.getName());
        return method.invoke(delegate, args);
    }

    public static Object newInstance(Class[] clazzes, Object[] objects) {
        return java.lang.reflect.Proxy.newProxyInstance(Mix.class.getClassLoader(), clazzes, new Mix(objects));
    }
}


public class Proxy {
    public static void main(String[] args) {
        //混合三种能力
        Object mixObj = Mix.newInstance(
                new Class[]{ISing.class, IDate.class, ISay.class},
                new Object[]{new SingImpl(), new DateImpl(), new SayImpl()});

        ISing singObj = (ISing) mixObj;
        singObj.sing();

        ISay sayObj = (ISay) mixObj;
        sayObj.say();

        IDate dateObj = (IDate) mixObj;
        dateObj.now();
    }
}

