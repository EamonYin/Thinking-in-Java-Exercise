package Chapter7.Test14;

/**
 * @author:YiMing
 * @create:2020/7/19,14:45
 * @version:1.0
 */
public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door();
    public Car(){
        for(int i = 0 ; i < 4 ;i++){
            wheel[i] = new Wheel();
        }
    }
    public void service(){
        System.out.println("这里是service()");
    }
}
