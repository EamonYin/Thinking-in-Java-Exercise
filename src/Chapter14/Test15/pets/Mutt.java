//: typeinfo/pets/Mutt.java
package Chapter14.Test15.pets;

import typeinfo.pets.Dog;

public class Mutt extends Dog {
    public Mutt(String name) {
        super(name);
    }

    public Mutt() {
        super();
    }

    public static class Factory implements Chapter14.Test15.factory.Factory<Mutt> {
        public Mutt create() {
            return new Mutt();
        }
    }
} ///:~
