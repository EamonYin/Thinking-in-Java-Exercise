package Chapter14.Test22;

import Chapter14.Test21.Interface;
import Chapter14.Test21.RealObject;
import Chapter14.Test21.SimpleProxy;

import java.lang.reflect.Proxy;

/**
 * @author:YiMing
 * @create:2020/8/21,18:20
 * @version:1.0
 */
public class Test22 {
    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("bonobo");
    }

    public static void main(String[] args) {
        //要代理的真实对象
        RealObject real = new RealObject();
        //代理对象的调用处理程序，我们将要代理的真实对象传入代理对象的调用处理的构造函数中，最终代理对象的调用处理程序会调用真实对象的方法
        DynamicProxyHandler handler = new DynamicProxyHandler(real);

        SimpleProxy sim=new SimpleProxy(real);
        consumer(sim);

        /**
         * 通过Proxy类的newProxyInstance方法创建代理对象，我们来看下方法中的参数
         * 第一个参数：Interface.getClass().getClassLoader()，使用handler对象的classloader对象来加载我们的代理对象
         * 第二个参数：real.getClass().getInterfaces()，这里为代理类提供的接口是真实对象实现的接口，这样代理对象就能像真实对象一样调用接口中的所有方法
         * 第三个参数：handler，我们将代理对象关联到上面的InvocationHandler对象上
         */

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxyHandler(sim));
        Interface proxy2 = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(), real.getClass().getInterfaces(), handler);

        consumer(proxy);

        System.out.println("---------------------------------");
        proxy2.doSomething();
        proxy2.somethingElse("Proxy2");
        System.out.println("---------------------------------");

    }
}
