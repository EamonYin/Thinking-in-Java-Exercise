package Chapter15.Test24;

import Chapter15.Test23.FactoryI;

import java.util.HashMap;
import java.util.Map;

/**
 * @author:YiMing
 * @create:2020/8/25,17:04
 * @version:1.0
 */
public class FactoryCapture {
    Map<String, FactoryI<?>> factories = new HashMap<String, FactoryI<?>>();

    public Object createNew(String factoryname, int arg) {
        FactoryI<?> factoryI = factories.get(factoryname);
        return factoryI.create(arg);
    }

    public void addFactory(String factoryname, FactoryI<?> factory) {
        factories.put(factoryname, factory);
    }
}
