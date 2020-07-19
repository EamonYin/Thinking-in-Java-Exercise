package Chapter7.Test15.InPackage;

/**
 * @author:YiMing
 * @create:2020/7/19,20:12
 * @version:1.0
 */
public class InPackage {
    protected String s;
    public InPackage(String str){
        s = str;
        System.out.println("InPackage中的str成员的值为"+s);
    }
}
