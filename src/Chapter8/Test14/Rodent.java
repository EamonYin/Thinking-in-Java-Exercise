package Chapter8.Test14;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Rodent {
//    Member r1 = new Member("r1");
//    Member r2 = new Member("r2");

    private SharedMember m;
    NonSharedMember m1 = new NonSharedMember("Nr1"),
                    m2 = new NonSharedMember("Nr2");

    public Rodent(SharedMember sm) {
        System.out.println("This is Rodent constructor");
        m = sm;
        m.addRef();
    }

    protected void dispose() {
        System.out.println("Disposing " + this);
        m.dispose();
    }

//    Rodent(){
//        System.out.println("This is Rodent Constructor");
//    }

    public void hop() {
        System.out.println("Rodent hopping");
    }

    public void scurry() {
        System.out.println("Rodent scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Rodent");
    }

    public String toString() {
        return "Rodent";
    }
}
