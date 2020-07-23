package Chapter8.Test14;

/**
 * @author:YiMing
 * @create:2020/7/23,21:50
 * @version:1.0
 */
public class SharedMember {
    private int refcount;

    public void addRef() {
        System.out.println("Number of references " + ++refcount);
    }

    protected void dispose() {
        if (--refcount == 0)
            System.out.println("Disposing " + this);
    }

    public SharedMember() {
        System.out.println("Shared member constructor");
    }

    public String toString() {
        return "Shared member";
    }
}
