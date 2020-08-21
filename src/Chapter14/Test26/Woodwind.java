package Chapter14.Test26;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/21,21:57
 * @version:1.0
 */
public class Woodwind extends Wind {
    public void play() { print("Woodwind.play()"); }
    public String what() { return "Woodwind"; }
    public void clearSpitValve() {
        print("Woodwind.clearSpitValve");
    }
}
