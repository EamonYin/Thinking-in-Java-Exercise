//: annotations/Testable.java
package Chapter20.annotations;
import org.junit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test void testExecute() { execute(); }
} ///:~
