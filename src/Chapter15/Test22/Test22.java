package Chapter15.Test22;

/**
 * @author:YiMing
 * @create:2020/8/25,17:23
 * @version:1.0
 */
public class Test22 {
    public static void main(String[] args) {
        ClassB<ClassA> b = new ClassB<ClassA>(ClassA.class, 2, "Chapter15.Test22.ClassA");
    }
}
