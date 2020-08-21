package Chapter14.Test26;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/21,21:56
 * @version:1.0
 */
public class Stringed  implements Instrument {
    public void play() { print("Stringed.play()"); }
    public String what() { return "Stringed"; }
    public void adjust() {}
    public void prepareInstrument() {
        print("Stringed.prepareInstrument");
    }
}
