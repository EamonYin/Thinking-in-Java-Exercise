package Chapter11.Test9;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Hamster extends Rodent {
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
