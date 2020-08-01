package Chapter10.Test16;

/**
 * @author:YiMing
 * @create:2020/7/28,20:55
 * @version:1.0
 */
public class Bicycle implements Cycle {
    public int wheels() { return 2; }
    CycleFactory bf = new CycleFactory(){
        @Override
        public Bicycle getCycle() {
            return new Bicycle();
        }
    };
}
