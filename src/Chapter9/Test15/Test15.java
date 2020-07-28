package Chapter9.Test15;

/**
 * @author:YiMing
 * @create:2020/7/27,18:36
 * @version:1.0
 */
public class Test15 {
    public static void TaskAll(ImpClass impClass){
        impClass.ac();
        impClass.one1();
        impClass.one2();
        impClass.two1();
        impClass.two2();
        impClass.three1();
        impClass.three2();
        impClass.NewExtendInterfaceMethod();
    }

    public static void main(String[] args) {
        ImpClass impClass = new ImpClass("Begin....");
        TaskAll(impClass);
    }
}
