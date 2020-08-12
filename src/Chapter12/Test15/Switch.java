package Chapter12.Test15;

/**
 * @author:YiMing
 * @create:2020/8/12,13:21
 * @version:1.0
 */
public class Switch {
    private boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println(this);
    }

    public void off() {
        state = false;
        System.out.println(this);
    }

    public String toString() {
        return state ? "on" : "off";
    }

}
