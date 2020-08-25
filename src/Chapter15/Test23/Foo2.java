package Chapter15.Test23;

/**
 * @author:YiMing
 * @create:2020/8/25,17:11
 * @version:1.0
 */
class Foo2<T> {
    private T x;

    public <F extends FactoryI<T>> Foo2(F factory,int i) {
        x = factory.create(i);
    }
    // ...
}
