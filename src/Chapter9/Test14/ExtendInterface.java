package Chapter9.Test14;

/**
 * @author:YiMing
 * @create:2020/7/27,17:35
 * @version:1.0
 */
public interface ExtendInterface extends One , Two , Three{
    @Override
    void one1();

    @Override
    void one2();

    @Override
    void two1();

    @Override
    void two2();

    @Override
    void three1();

    @Override
    void three2();

    void NewExtendInterfaceMethod();
}
