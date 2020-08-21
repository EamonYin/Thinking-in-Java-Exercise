package Chapter14.Test26;

/**
 * @author:YiMing
 * @create:2020/8/21,21:58
 * @version:1.0
 */
public class Music {
    static void tune(Instrument i) {
        // ...
        i.play();
    }
    static void tuneAll(Instrument[] e) {
        for(Instrument instrument : e)
            tune(instrument);
    }
    static void prepareAll(Instrument[] e) {
        for(Instrument instrument : e)
            instrument.prepareInstrument();
    }
}
