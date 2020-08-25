package Chapter15.Test23;

public class Widget {
    public static class Factory implements FactoryI<Widget> {
        public Widget create(int i) {
            System.out.println("this is Factory" + i);
            return new Widget();
        }
    }
}
