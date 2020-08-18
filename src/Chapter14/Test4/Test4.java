package Chapter14.Test4;

/**
 * @author:YiMing
 * @create:2020/8/18,18:03
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        // Upcast to shape:
        Shape shape = new Rhomboid();
        // Downcast to Rhomboid:
        Rhomboid r = (Rhomboid)shape;
        // Test before Downcasting:
        Circle c = null;
        if(shape instanceof Circle)
            c = (Circle)shape;
        else
            System.out.println("shape not a Circle");
    }
}
