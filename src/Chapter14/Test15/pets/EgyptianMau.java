//: typeinfo/pets/EgyptianMau.java
package Chapter14.Test15.pets;

import typeinfo.pets.Cat;

public class EgyptianMau extends Cat {
    public EgyptianMau(String name) {
        super(name);
    }

    public EgyptianMau() {
        super();
    }

    public static class Factory implements Chapter14.Test15.factory.Factory<EgyptianMau> {
        public EgyptianMau create() {
            return new EgyptianMau();
        }
    }
} ///:~
