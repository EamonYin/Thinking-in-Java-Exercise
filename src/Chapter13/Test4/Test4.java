package Chapter13.Test4;

/**
 * @author:YiMing
 * @create:2020/8/15,17:57
 * @version:1.0
 */
public class Test4 {
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack's Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}
