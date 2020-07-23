package Chapter8.Test14;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Gerbil extends Rodent {

    NonSharedMember m1 = new NonSharedMember("Ng1"),
                    m2 = new NonSharedMember("Ng2");

    public Gerbil(SharedMember sm) {
        super(sm);
        System.out.println("This is Gerbil Constructor");
    }

    public void hop() {
        System.out.println("Gerbil hopping");
    }

    public void scurry() {
        System.out.println("Gerbil scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Gerbil");
    }

    public String toString() {
        return "Gerbil";
    }
}
