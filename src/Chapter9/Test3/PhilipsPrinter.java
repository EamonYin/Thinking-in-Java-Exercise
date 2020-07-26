package Chapter9.Test3;

/**
 * @author:YiMing
 * @create:2020/7/25,18:31
 * @version:1.0
 */
public class PhilipsPrinter extends Printer{
    public int model = 1;

    public void print(){
        System.out.println("This is PhilipsPrinter.print()"+model);
    }
}
