package Chapter6.Example01;//: access/IceCream.java
// Demonstrates "private" keyword.

class Sundae {
    private Sundae() { //无参构造器是private的
    }

    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        //! Sundae x = new Sundae();    //因为Sundae无参构造器是private的，无法创建！
        Sundae x = Sundae.makeASundae();
    }
} ///:~
