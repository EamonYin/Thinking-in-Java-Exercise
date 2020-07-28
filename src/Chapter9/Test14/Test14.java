package Chapter9.Test14;

/**
 * @author:YiMing
 * @create:2020/7/27,17:59
 * @version:1.0
 */
public class Test14 {

    static void Task1(One one){
        one.one1();
        one.one2();
    }
    static void Task2(Two two){
        two.two1();
        two.two2();
    }
    static void Task3(Three three){
        three.three1();
        three.three2();
    }
    static void TaskAll(ImpClass impClass){
        impClass.one1();
        impClass.one2();
        impClass.two1();
        impClass.two2();
        impClass.three1();
        impClass.three2();
        impClass.NewExtendInterfaceMethod();
    }

    public static void main(String[] args) {
        ImpClass impClass = new ImpClass("Begin...");
        Task1(impClass);
        System.out.println();
        Task2(impClass);
        System.out.println();
        Task3(impClass);
        System.out.println();
        TaskAll(impClass);

    }
}
