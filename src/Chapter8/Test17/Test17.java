package Chapter8.Test17;

/**
 * @author:YiMing
 * @create:2020/7/24,19:37
 * @version:1.0
 */
public class Test17 {
    public static void main(String[] args) {
        Cycle[] cycles = {
                new Bicycle(),
                new Tricycle(),
                new Unicycle()
        };
        ((Bicycle)cycles[0]).balance();
        ((Unicycle)cycles[2]).balance();

    }
}
