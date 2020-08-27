package Chapter15.Test34;

/**
 * @author:YiMing
 * @create:2020/8/27,18:51
 * @version:1.0
 */
public abstract class GenericProcessor<T extends GenericProcessor<T>>{
    abstract T process(T arg);
    T test() { return process(null); }
}
