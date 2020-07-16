package Chapter7.Test2;

/**
 * @author:YiMing
 * @create:2020/7/16,16:31
 * @version:1.0
 */
public class Detergent extends Cleanser {
    public void scrub() {
        append(" Detergent.scrub()");
        super.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public static void main(String[] args) {
        Detergent detergent = new Detergent();
        detergent.dilute();
        detergent.scrub();
        detergent.apply();
        detergent.foam();
        System.out.println(detergent);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }
}
