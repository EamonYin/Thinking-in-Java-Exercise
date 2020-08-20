//: typeinfo/pets/Mouse.java
package Chapter14.Test15.pets;

import typeinfo.pets.Rodent;

public class Mouse extends Rodent {
    public Mouse(String name) {
        super(name);
    }

    public Mouse() {
        super();
    }

    public static class Factory implements Chapter14.Test15.factory.Factory<Mouse> {
        public Mouse create() {
            return new Mouse();
        }
    }
} ///:~
