package Chapter18.Test33;// Write a program that displays the current value of a directory called
// "base directory" and prompts you for a new value. Use the Preferences API
// to store the value.

import java.util.prefs.*;

import static net.mindview.util.Print.*;

public class Test33 {
    public static void main(String[] args) throws Exception {
        Preferences prefs = Preferences.userNodeForPackage(Test33.class);
        int pp = prefs.getInt("base directory", 0);
        prefs.putInt("base directory", 5);
        for (String key : prefs.keys()) print(prefs.get(key, null));
        print(prefs.getInt("base directory", 5));
    }
}