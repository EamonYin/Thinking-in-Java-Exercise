package Chapter10.Test16;

/**
 * @author:YiMing
 * @create:2020/7/28,20:52
 * @version:1.0
 */
public class Unicycle implements Cycle {
    public int wheels() { return 1; }
    CycleFactory uf = new CycleFactory(){
        @Override
        public Cycle getCycle() {
            return new Unicycle();
        }
    };
}
