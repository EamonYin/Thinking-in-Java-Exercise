package Chapter10.Test16;

/**
 * @author:YiMing
 * @create:2020/7/28,20:56
 * @version:1.0
 */
public class Tricycle implements Cycle {
    public int wheels() { return 3; }
    CycleFactory tf = new CycleFactory(){
        @Override
        public Cycle getCycle() {
            return new Tricycle();
        }
    };
}
