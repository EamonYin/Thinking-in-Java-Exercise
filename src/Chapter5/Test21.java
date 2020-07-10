package Chapter5;

/**
 * @author:YiMing
 * @create:2020/7/10,20:07
 * @version:1.0
 */
public class Test21 {
    enum Coin {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE;
    }

    static void describe(Coin coin) {
        switch (coin) {
            case ONE:
                System.out.println("1块钱");
                break;
            case TWO:
                System.out.println("2块钱");
                break;
            case THREE:
                System.out.println("3块钱");
                break;
            case FOUR:
                System.out.println("4块钱");
                break;
            case FIVE:
                System.out.println("5块钱");
                break;
            default:
                break;

        }
    }

    public static void main(String[] args) {
        Coin[] values = Coin.values();
        for (Coin c : values) {
            System.out.print(c + " ordinal:" + c.ordinal()+" 描述:");
            describe(c);
            System.out.println();
        }


    }
}
