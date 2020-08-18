package Chapter14.Test5;

/**
 * @author:YiMing
 * @create:2020/8/18,18:18
 * @version:1.0
 */
public class Test5 {
    public static void main(String[] args) {
        RandomShapeGenerator gen = new RandomShapeGenerator();
        Shape[] shapes = new Shape[9];
        for (int i = 0; i < shapes.length; i++) {
            shapes[i] = gen.next();
        }
        for (Shape shape : shapes) {
            if (!(shape instanceof Circle))
                shape.rotate();
        }
    }
}
