package Chapter14.Test22;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author:YiMing
 * @create:2020/8/21,18:13
 * @version:1.0
 */
public class DynamicProxyHandler implements InvocationHandler {
    //代理类中的真实对象
    private Object proxied;

    //构造函数，给我们的真实对象赋值
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //在真实的对象执行之前我们可以添加自己的操作
        System.out.println("**** proxy: " + proxy.getClass() +
                ", method: " + method + ", args: " + args);
        if (args != null)
            for (Object arg : args)
                System.out.println("  " + arg);

        System.out.println("before invoke。。。");
        //------------------------------------------------------
        Object invoke = method.invoke(proxied, args);
        //------------------------------------------------------
        //在真实的对象执行之后我们可以添加自己的操作
        System.out.println("after invoke。。。");

        return invoke;
    }
}
