package Chapter7.Test2;

/**
 * @author:YiMing
 * @create:2020/7/16,16:30
 * @version:1.0
 */
public class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a;}
    public void dilute(){append(" dilute()");}
    public void apply(){append(" apply()");}
    public void scrub(){append(" scrub()");}
    public String toString(){return s;}

    public static void main(String[] args) {
        Cleanser cleanser = new Cleanser();
        cleanser.dilute();
        cleanser.scrub();
        cleanser.apply();
        System.out.println(cleanser);
    }
}
