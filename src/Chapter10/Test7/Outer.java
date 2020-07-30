package Chapter10.Test7;

/**
 * @author:YiMing
 * @create:2020/7/30,18:35
 * @version:1.0
 */
public class Outer {
    private int i;
    private void IsOuter(){
        System.out.println("This is Outer.IsOuter()");
    }
    class Inner{
        private void Isinner() {
            i++;
            IsOuter();
        }
    }

    public void getInner(){
        Inner inner = new Inner();
        inner.Isinner();
        System.out.println("i="+i);
    }
}
