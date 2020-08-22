package Chapter15.Test2;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;

/**
 * @author:YiMing
 * @create:2020/8/22,17:17
 * @version:1.0
 */
public class Test2 {
    public static void main(String[] args) {
        MyHolder<Pet> petMyHolder = new MyHolder<>();
        petMyHolder.setA(new Cat("cat"));
        petMyHolder.setB(new Dog("dog"));
        petMyHolder.setC(new Pug("pug"));
        System.out.println(petMyHolder.getA());
        System.out.println(petMyHolder.getB());
        System.out.println(petMyHolder.getC());
    }
}
