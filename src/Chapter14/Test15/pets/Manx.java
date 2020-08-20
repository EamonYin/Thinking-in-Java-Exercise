//: typeinfo/pets/Manx.java
package Chapter14.Test15.pets;

import typeinfo.pets.Cat;

public class Manx extends Cat {

    public Manx(String name) {
        super(name);
    }

    public Manx() {
        super();
    }

    public static class Factory implements Chapter14.Test15.factory.Factory<Manx> {
        public Manx create() {
            return new Manx();
        }
    }
} ///:~
