package Chapter18.Test9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author:YiMing
 * @create:2020/9/9,13:54
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/Chapter18/Test9/Test9.java"));
        StringBuilder stringBuilder = new StringBuilder();
        LinkedList<String> strings = new LinkedList<>();
        String s;
        while ((s = bufferedReader.readLine())!=null){
            strings.add(s.toUpperCase()+"\n");
        }
            bufferedReader.close();
            System.out.println(strings);

    }
}
