package Chapter8.Test12;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Mouse extends Rodent {

    Member m1 = new Member("m1");
    Member m2 = new Member("m2");

    Mouse(){
        System.out.println("This is Mouse Constructor");
    }

    public void hop() {
        System.out.println("Mouse hopping");
    }

    public void scurry() {
        System.out.println("Mouse scurrying");
    }

    public void reproduce() {
        System.out.println("Making more Mouse");
    }

    public String toString() {
        return "Mouse";
    }


}
