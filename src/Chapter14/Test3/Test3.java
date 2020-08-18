package Chapter14.Test3;

import java.util.Arrays;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/18,17:53
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(
                new Circle(), new Square(), new Triangle(),
                new Rhomboid()
        );
        for (Shape shape : shapes)
            shape.draw();
        // 向上转型:
        Shape shape = new Rhomboid();
        // 向下转型:
        Rhomboid r = (Rhomboid) shape;
        // 向下转型为Circle，编译成功
        // 运行时抛出异常ClassCastException:
        //Circle c = (Circle)shape;
    }
}