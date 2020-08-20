//: typeinfo/pets/Rat.java
package Chapter14.Test15.pets;

import typeinfo.pets.Rodent;

public class Rat extends Rodent {
  public Rat(String name) { super(name); }
  public Rat() { super(); }

  public static class Factory implements Chapter14.Test15.factory.Factory<Rat> {
    public Rat create() {
      return new Rat();
    }
  }
} ///:~
