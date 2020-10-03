package Chapter6.Example02;//: access/ChocolateChip.java
// Can't use package-access member from another package.

import Chapter6.Example02.dessert.*;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }

    public void chomp() {
        //! bite(); // Cookie.bite()是protected的
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
} /* Output:
Cookie constructor
ChocolateChip constructor
*///:~
