package Chapter5;

/**
 * @author:YiMing
 * @create:2020/10/7,8:00
 * @version:1.0
 */
public class CodePriority {
    /**
     * 静态代码块：
     * 静态代码块只执行一次
     * 位置：在类中成员位置，用{}号括起来，但是要使用static修饰
     */
    static {
        System.out.println("a");
    }

    public static int b = (new CodePriority()).a;

    static {
        System.out.println(b);
    }

    static int a = 1;

    /**
     * 构造代码块：
     * 构造函数执行一次，构造代码块便执行一次
     * 位置：在类中成员位置，用{}号括起来。
     */ {
        System.out.println("c");
    }

    public CodePriority() {
        System.out.println("【无参构造方法");
        {
            /**
             * 局部代码按上下顺序执行
             * 局部代码块在方法中，用{}号括起来。
             */
            System.out.println("  局部代码块】");
        }
    }

    public static void main(String[] args) {
        CodePriority CodePriority = new CodePriority();
        System.out.println("代码块的优先级：\n" +
                "静态代码块 → 构造代码块 → 构造方法");
    }
}
