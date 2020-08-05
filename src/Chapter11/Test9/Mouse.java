package Chapter11.Test9;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Mouse extends Rodent {
    public void hop() {
        System.out.println("Mouse hopping");
    }

    public void scurry() {
        System.out.println("Mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Mouse");
    }

    public String toString() {
        return "Mouse";
    }
}
