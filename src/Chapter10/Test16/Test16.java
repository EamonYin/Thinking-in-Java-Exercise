package Chapter10.Test16;

/**
 * @author:YiMing
 * @create:2020/7/28,20:57
 * @version:1.0
 */
public class Test16 {
    public static void ride(CycleFactory fact) {
        Cycle c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }

    public static void main(String[] args) {
        ride(new Unicycle().uf);
        ride(new Bicycle().bf);
        ride(new Tricycle().tf);
    }
}
