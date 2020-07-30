package Chapter10.Test11;

/**
 * @author:YiMing
 * @create:2020/7/30,21:29
 * @version:1.0
 */
public class Test11 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        SimpleInterface simpleInterface = outer.get();
        simpleInterface.f();
        System.out.println("--------------");
        simpleInterface = outer.get2();
        simpleInterface.f();
        System.out.println("------↓ 向下转型------");
        //无法向下转型，因为Inner是private，所以被隐藏了
//        Outer.Inner inner = outer.get2();
//        inner.f();




    }
}
