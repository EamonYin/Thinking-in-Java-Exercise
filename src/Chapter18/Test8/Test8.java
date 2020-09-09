package Chapter18.Test8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 * @author:YiMing
 * @create:2020/9/9,13:54
 * @version:1.0
 */
public class Test8 {
    public static void main(String[] args) throws IOException {

        if(args.length==0)System.exit(0);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        StringBuilder stringBuilder = new StringBuilder();
        LinkedList<String> strings = new LinkedList<>();
        String s;
        while ((s = bufferedReader.readLine())!=null){
            strings.add(s+"\n");
        }
            bufferedReader.close();
            System.out.println(strings);

    }
}
