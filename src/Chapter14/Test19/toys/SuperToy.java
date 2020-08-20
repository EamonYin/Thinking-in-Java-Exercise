package Chapter14.Test19.toys;
/**
 * @author:YiMing
 * @create:2020/8/20,22:18
 * @version:1.0
 */
public class SuperToy extends FancyToy {
    private int IQ;
    private String s;

    public SuperToy(int intelligence,String str) {
        IQ = intelligence;
        this.s = str;
    }

    private void MethodTest1(){
        System.out.println("This is Method1");
    }

    private void MethodTest2(){
        System.out.println("This is Method2");
    }

    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}
