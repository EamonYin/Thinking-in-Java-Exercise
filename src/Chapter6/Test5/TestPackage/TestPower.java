package Chapter6.Test5.TestPackage;

/**
 * @author:YiMing
 * @create:2020/7/12,22:46
 * @version:1.0
 */
public class TestPower {
    public TestPower(){
        System.out.println("这里是TestPower的public无参（默认）构造器");
    }
    /*TestPower(){
        System.out.println("这里是TestPower的“默认包”无参（默认）构造器");
    }*/
    public void A(){
        System.out.println("这里是“public”方法A");
    }
    private void B(){
        System.out.println("这里是“private”方法B");
    }
    protected void C(){
        System.out.println("这里是“protected方法C”");
    }

}
