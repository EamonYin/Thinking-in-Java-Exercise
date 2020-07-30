package Chapter10.Test14;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author:YiMing
 * @create:2020/7/30,22:36
 * @version:1.0
 */
public class Second {
    public NoDefault get1(int i) {
        return new NoDefault(i){};
    }
    public NoDefault get2(int i){
        return new NoDefault(i){
            @Override
            public void f() {
                System.out.println("Second.get2.f");
            }
        };
    }
}
