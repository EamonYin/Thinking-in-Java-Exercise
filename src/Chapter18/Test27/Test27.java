package Chapter18.Test27;

import java.io.*;

/**
 * @author:YiMing
 * @create:2020/9/12,16:58
 * @version:1.0
 */
public class Test27 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        A a = new A();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./src/Chapter18/Test27/Test27.out"));
        oos.writeObject(a);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./src/Chapter18/Test27/Test27.out"));
        A readA = (A) ois.readObject();
        System.out.println(readA);
    }
}
