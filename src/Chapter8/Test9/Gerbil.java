package Chapter8.Test9;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Gerbil extends Rodent{
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
