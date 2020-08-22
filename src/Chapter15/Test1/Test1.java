package Chapter15.Test1;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;

/**
 * @author:YiMing
 * @create:2020/8/22,16:57
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Holder3<Pet> fsdf = new Holder3<>(new Pet("fsdf"));
        System.out.println(fsdf.get());
        fsdf.set(new Dog("dogg"));
        System.out.println(fsdf.get());
        fsdf.set(new Cat("catt"));
        System.out.println(fsdf.get());
    }
}
