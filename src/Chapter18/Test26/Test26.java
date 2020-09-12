package Chapter18.Test26;// Modify strings/JGrep.java to use java.nio memory mapped files.

import java.util.regex.*;

import static net.mindview.util.Print.*;

import java.util.*;

import net.mindview.util.*;

import java.nio.*;
import java.nio.channels.*;
import java.io.*;
import java.nio.charset.*;


public class Test26 {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        // Iterate through the lines of the input file:
        int index = 0;
        Matcher m = p.matcher("");
        FileChannel fc = new FileInputStream(new File(args[0])).getChannel();
        MappedByteBuffer in = fc.map(FileChannel.MapMode.READ_ONLY, 0, fc.size());
        String[] sa = Charset.forName(System.getProperty("file.encoding")).decode(in).toString().split("\n");
        print(Arrays.toString(sa));
        for (String line : sa) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
        fc.close();
    }
}