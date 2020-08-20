//: typeinfo/pets/Hamster.java
package Chapter14.Test15.pets;

import typeinfo.pets.Rodent;

public class Hamster extends Rodent {
    public Hamster(String name) {
        super(name);
    }

    public Hamster() {
        super();
    }

    public static class Factory implements Chapter14.Test15.factory.Factory<Hamster> {
        public Hamster create() {
            return new Hamster();
        }
    }
} ///:~
