package Chapter14.Test26;

/**
 * @author:YiMing
 * @create:2020/8/21,21:59
 * @version:1.0
 */
public class Test26 {
    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(), new Percussion(),
                new Stringed(), new Brass(),
                new Woodwind(),
        };
        Music.prepareAll(orchestra);
        Music.tuneAll(orchestra);
    }
}
