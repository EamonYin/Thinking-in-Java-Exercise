package Chapter8.Test14;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Hamster extends Rodent {

    NonSharedMember m1 = new NonSharedMember("Nh1"),
                    m2 = new NonSharedMember("Nh2");

    public Hamster(SharedMember sm) {
        super(sm);
        System.out.println("This is Hamster Constructor");
    }

    public void hop() {
        System.out.println("Hamster hopping");
    }

    public void scurry() {
        System.out.println("Hamster scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Hamster");
    }

    public String toString() {
        return "Hamster";
    }
}
