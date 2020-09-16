package Chapter20.Example01;


import Chapter20.atunit.Test;

public class Testable {
    public void execute() {
        System.out.println("Executing...");
    }

    @Test
    void testExecute() {
        execute();
    }
}
