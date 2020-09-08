package Chapter18.Test6;

import Chapter18.Test5.ProcessFiles;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author:YiMing
 * @create:2020/9/8,15:43
 * @version:1.0
 */
public class Test6 {
    public static void main(String[] args) {
        String[] a={"./src/Chapter18"};
        final SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                Date da=new Date(file.lastModified());
                try {
                    if(da.after(sdf.parse("09/08/2020"))) System.out.println(file);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        },"java").start(a);
    }
}
