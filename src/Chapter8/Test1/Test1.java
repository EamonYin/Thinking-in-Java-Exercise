package Chapter8.Test1;

/**
 * @author:YiMing
 * @create:2020/7/21,19:23
 * @version:1.0
 */
public class Test1 {
    public static void ride(Cycle cycle){
        cycle.Test();
    }

    public static void main(String[] args) {
        Cycle cycle = new Cycle();
        ride(cycle);
        Bicycle bicycle = new Bicycle();
        ride(bicycle);
        Tricycle tricycle = new Tricycle();
        ride(tricycle);
        ride(new Unicycle());
    }
}
