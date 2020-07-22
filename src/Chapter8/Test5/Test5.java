package Chapter8.Test5;

/**
 * @author:YiMing
 * @create:2020/7/22,20:51
 * @version:1.0
 */
public class Test5 {
    public void ride(Cycle cycle){
        int wheels = cycle.wheels();
        System.out.println(wheels);
    }

    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            Test5 test5 = new Test5();
            test5.ride(new Cycle());
            i++;
        }
    }
}
