package Chapter9.Test15;

/**
 * @author:YiMing
 * @create:2020/7/27,17:37
 * @version:1.0
 */
public class ImpClass extends AbstractClass implements ExtendInterface {

    public ImpClass(String s) {
        super(s);
    }

    public void ac() {
        System.out.println("All.ac");
    }

    @Override
    public void one1() {
        System.out.println("ImpClass.one1");
    }

    @Override
    public void one2() {
        System.out.println("ImpClass.one2");
    }

    @Override
    public void two1() {
        System.out.println("ImpClass.two1");
    }

    @Override
    public void two2() {
        System.out.println("ImpClass.two2");
    }

    @Override
    public void three1() {
        System.out.println("ImpClass.three1");
    }

    @Override
    public void three2() {
        System.out.println("ImpClass.three2");
    }

    @Override
    public void NewExtendInterfaceMethod() {
        System.out.println("ImpClass.NewExtendInterfaceMethod()");
    }

}
