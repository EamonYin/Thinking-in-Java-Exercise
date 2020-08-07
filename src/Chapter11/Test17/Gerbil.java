package Chapter11.Test17;

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

    public String hop() {
        return this + " is hopping";
    }
}
