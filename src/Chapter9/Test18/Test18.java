package Chapter9.Test18;

/**
 * @author:YiMing
 * @create:2020/7/28,20:57
 * @version:1.0
 */
public class Test18 {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new UnicycleFactory());
        ride(new BicycleFactory ());
        ride(new TricycleFactory ());
    }
}
