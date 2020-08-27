package Chapter15.Test35;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @author:YiMing
 * @create:2020/8/27,19:30
 * @version:1.0
 */
public class Test35 {
    public static void main(String[] args) {
        Set<Dog> dogs = Collections.checkedSet(new HashSet<Dog>(), Dog.class);
        dogs.add(new Dog());
        //dogs.add(new Cat());
    }
}
