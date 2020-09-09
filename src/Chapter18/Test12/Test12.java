package Chapter18.Test12;

import java.io.*;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author:YiMing
 * @create:2020/9/9,13:54
 * @version:1.0
 */
public class Test12 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("./src/Chapter18/Test12/Test12.java"));
        StringBuilder stringBuilder = new StringBuilder();
        LinkedList<String> strings = new LinkedList<>();
        String s;
        while ((s = bufferedReader.readLine())!=null){
            strings.add(s+"\n");
        }
        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("./src/Chapter18/Test12/Test12输出.txt")));
        Iterator<String> iterator = strings.iterator();
        int i =1;
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
            pw.println(i+++":"+next);
        }
        pw.close();

    }
}
