package Chapter15.Test34;

/**
 * @author:YiMing
 * @create:2020/8/27,18:52
 * @version:1.0
 */
public class ConcreteProcessor extends GenericProcessor<ConcreteProcessor>{

    @Override
    ConcreteProcessor process(ConcreteProcessor arg) {
        if(arg == null)
            return this;
        return arg;
    }
}
