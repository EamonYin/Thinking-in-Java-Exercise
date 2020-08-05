package Chapter11.Test8;

/**
 * @author:YiMing
 * @create:2020/8/3,19:00
 * @version:1.0
 */
public class Gerbil {
    int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public String toString() {
        return "gerbil " + gerbilNumber;
    }

    public void hop() {
        System.out.println(this + " is hopping");
    }
}
