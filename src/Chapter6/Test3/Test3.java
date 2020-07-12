package Chapter6.Test3;

import Chapter6.Test3.debug.DeBug;

/**
 * @author:YiMing
 * @create:2020/7/12,20:48
 * @version:1.0
 */
public class Test3 {
    public static void main(String[] args) {
        DeBug deBug = new DeBug();
        deBug.debug();

        System.out.println("-------------------------- ");

        Chapter6.Test3.debugoff.DeBug deBug1 = new Chapter6.Test3.debugoff.DeBug();
        deBug1.debug();
    }
}
