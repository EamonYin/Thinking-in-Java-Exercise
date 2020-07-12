package Chapter6.Test4.MainPackage;

import Chapter6.Test4.ProtectPackage.ProtectA;

/**
 * @author:YiMing
 * @create:2020/7/12,22:40
 * @version:1.0
 */
public class MainTest4 extends ProtectA{

    public MainTest4(){
        System.out.println("这里是MainTest4");
    }

    public void TakeProtectObj(){
        ProtectObj();
    }

    public static void main(String[] args) {
        MainTest4 mainTest4 = new MainTest4();
        mainTest4.TakeProtectObj();

    }
}
