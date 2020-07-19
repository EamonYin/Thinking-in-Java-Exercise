package Chapter7.Test15;

import Chapter7.Test15.InPackage.ExtendInPackage;
import Chapter7.Test15.InPackage.InPackage;

/**
 * @author:YiMing
 * @create:2020/7/19,20:14
 * @version:1.0
 */
public class Test15 {
    public static void main(String[] args) {
        InPackage inPackage = new InPackage(" 哈哈 ");
        //System.out.println("-----"+inPackage.s); //protected在 继承类 或者 同一包的类 才可以访问的
        ExtendInPackage ExtendInPackage = new ExtendInPackage(" 继承于ExtendInPackage  ");

    }
}
