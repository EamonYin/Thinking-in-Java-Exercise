package Chapter15.Test2;

/**
 * @author:YiMing
 * @create:2020/8/22,17:13
 * @version:1.0
 */
public class MyHolder<T> {
    private T a;
    private T b;
    private T c;

    public T getA() {
        return a;
    }

    public void setA(T a) {
        this.a = a;
    }

    public T getB() {
        return b;
    }

    public void setB(T b) {
        this.b = b;
    }

    public T getC() {
        return c;
    }

    public void setC(T c) {
        this.c = c;
    }

    MyHolder() {
        a = null;
        b = null;
        c = null;
    }

}
