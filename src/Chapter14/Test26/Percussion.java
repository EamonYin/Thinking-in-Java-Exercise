package Chapter14.Test26;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/21,21:55
 * @version:1.0
 */
public class Percussion implements Instrument {
    public void play() { print("Percussion.play()"); }
    public String what() { return "Percussion"; }
    public void adjust() {}
    public void prepareInstrument() {
        print("Percussion.prepareInstrument");
    }
}
