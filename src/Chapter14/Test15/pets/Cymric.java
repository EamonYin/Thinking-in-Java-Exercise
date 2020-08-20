//: typeinfo/pets/Cymric.java
package Chapter14.Test15.pets;


import Chapter14.Test15.factory.Factory;
import typeinfo.pets.Manx;

public class Cymric extends Manx {
    public static class Factory implements Chapter14.Test15.factory.Factory<Cymric> {
        public Cymric create() {
            return new Cymric();
        }
    }

    public Cymric(String name) {
        super(name);
    }

    public Cymric() {
        super();
    }
} ///:~
