package Chapter13.Test20;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.Scanner;

/**
 * @author:YiMing
 * @create:2020/8/17,16:23
 * @version:1.0
 */
public class Test20 {
    public static void main(String[] args) {
        String s="5 57673 4.5787 9.3557 dasfdsv";
        Scanner sc=new Scanner(new BufferedReader(new StringReader(s)));
        int i=sc.nextInt();
        long l=sc.nextLong();
        float f=sc.nextFloat();
        double d=sc.nextDouble();
        String ss=sc.next();
        System.out.println("  i "+i+" l:  "+l+"  f: "+f+" "+"  d: "+d+"  ss: "+ss);
    }

}
