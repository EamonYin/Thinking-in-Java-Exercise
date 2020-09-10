package Chapter18.Test22;

import Chapter18.Example02.OSExecute;

import java.util.List;

public class OSExecuteDemo {
    public static void main(String[] args) {
        List<String> result = OSExecute2.command("javap -c ./src/Chapter18/Test22/OSExecuteDemo");
        for (String s:result){
            System.out.println(s);
        }
    }
}