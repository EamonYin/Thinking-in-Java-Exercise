package Chapter18.Test25;/* Experiment with changing the ByteBuffer.allocate() statements
* in the examples in this chapter to ByteBuffer.allocateDirect().
* Demonstrate performance differences, but also notice whether
* the startup time of the programs noticeably changes.
*/
import static net.mindview.util.Print.*;
import java.nio.*;
 
abstract class Tester{
    private String name;
    public Tester(String name){this.name=name;}
    public void runTest(){
        long start=System.nanoTime();
        test();
        long end=System.nanoTime();
        print(name+": "+(end-start));
    }
    public abstract void test();
    static Tester[] tests={
        new Tester("withDirect"){
            public void test() {
                ByteBuffer bb=ByteBuffer.allocateDirect(32);
                IntBuffer ib=bb.asIntBuffer();
                for(int i=0;i<8;i++){
                    ib.put(i);
                }
            }
        
        },
        new Tester("withoutDirect"){
            public void test() {
                ByteBuffer bb=ByteBuffer.allocate(32);
                IntBuffer ib=bb.asIntBuffer();
                for(int i=0;i<8;i++){
                    ib.put(i);
                }
            }
        }
    };
}
public class Test25 {
    public static void main(String[] args){
        for(Tester test:Tester.tests){
            test.runTest();
        }
    }
}