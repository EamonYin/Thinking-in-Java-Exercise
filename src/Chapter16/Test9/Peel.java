package Chapter16.Test9;

/**
 * @author:YiMing
 * @create:2020/8/30,18:13
 * @version:1.0
 */
public class Peel<T> {
    T fruit;
    Peel(T fruit) { this.fruit = fruit; }
    void peel() { System.out.println("Peeling "+ fruit); }
}
