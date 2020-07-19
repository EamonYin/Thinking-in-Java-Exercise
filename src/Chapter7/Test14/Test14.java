package Chapter7.Test14;

/**
 * @author:YiMing
 * @create:2020/7/19,16:26
 * @version:1.0
 */
public class Test14 {
    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.service();
    }
}
