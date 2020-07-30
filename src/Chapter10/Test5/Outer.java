package Chapter10.Test5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author:YiMing
 * @create:2020/7/29,22:11
 * @version:1.0
 */
public class Outer {
    class Inner{
        {
            System.out.println("Inner created");
        }
    }
}
