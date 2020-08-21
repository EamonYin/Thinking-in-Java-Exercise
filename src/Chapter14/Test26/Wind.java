package Chapter14.Test26;
import static net.mindview.util.Print.*;
/**
 * @author:YiMing
 * @create:2020/8/21,21:54
 * @version:1.0
 */
public class Wind implements Instrument {
    public void play() { print("Wind.play()"); }
    public String what() { return "Wind"; }
    public void adjust() {}
    public void clearSpitValve() {
        print("Wind.clearSpitValve");
    }
    public void prepareInstrument() {
        clearSpitValve();
    }
}
