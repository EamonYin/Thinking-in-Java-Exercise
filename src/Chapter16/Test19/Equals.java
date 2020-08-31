package Chapter16.Test19;

/**
 * @author:YiMing
 * @create:2020/8/31,18:49
 * @version:1.0
 */
public class Equals extends A{


    Equals(int n) {
        super(n);
    }

    public boolean equals(Object b) {
        if (b instanceof A) return (n==((A)b).n);
        return false;
    }
}
