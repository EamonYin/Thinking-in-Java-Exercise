package Chapter5;

/**
 * @author:YiMing
 * @create:2020/7/4,20:57
 * @version:1.0
 */
public class Dog {
    public void bark(int a) {
        System.out.println("barking");
    }

    public void bark(String b) {
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark(1);
        d.bark("a");
    }


}
