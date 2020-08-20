//: typeinfo/pets/Pug.java
package Chapter14.Test15.pets;

import typeinfo.pets.Dog;

public class Pug extends Dog {
  public Pug(String name) { super(name); }
  public Pug() { super(); }

  public static class Factory implements Chapter14.Test15.factory.Factory<Pug> {
    public Pug create() {
      return new Pug();
    }
  }
} ///:~
