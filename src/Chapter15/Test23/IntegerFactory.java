package Chapter15.Test23;

public class IntegerFactory implements FactoryI<Integer> {
    public Integer create(int i) {
        System.out.println("this is IntegerFactory" + i);
        return new Integer(0);
    }
}
