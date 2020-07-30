package Chapter10.Test9;

/**
 * @author:YiMing
 * @create:2020/7/30,21:08
 * @version:1.0
 */
public class ImplOuter {
    public Outer getOuter (){
        class OI implements Outer{
            public void IsOuter(){
                System.out.println("This is ImplOuter.getOuter.OI");
            }
        }
        return new OI();
    }
}
