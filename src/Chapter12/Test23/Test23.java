package Chapter12.Test23;

import Chapter12.Test22.ConstructionException;

/**
 * @author:YiMing
 * @create:2020/8/13,20:18
 * @version:1.0
 */
public class Test23 {
    public static void main(String[] args) {
        for (boolean b = false; ; b = !b) {
            try {
                System.out.println("Constructing...");
                FailingConstructor failingConstructor = new FailingConstructor(b);
                try {
                    System.out.println("Processing...");
                } finally {
                    System.out.println("Cleanup...");
                }
            } catch (ConstructionException e) {
                System.out.println("Construction has failed: " + e);
                break;
            }
        }
    }
}
