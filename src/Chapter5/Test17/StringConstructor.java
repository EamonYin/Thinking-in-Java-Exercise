package Chapter5.Test17;

/**
 * @author:YiMing
 * @create:2020/7/10,19:42
 * @version:1.0
 */
public class StringConstructor {
    public StringConstructor(String str){
        System.out.println("构造器打印："+str);
    }

    public static void main(String[] args) {
        StringConstructor[] a;
        /**
         * 构造器调用中的初始化信息表并没有打印出来
         * 没有初期化并没有启用构造器。
         */
        System.out.println("---------------------------------");
        StringConstructor stringConstructor = new StringConstructor("赋值");

    }
}
