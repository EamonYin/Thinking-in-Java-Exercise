package Chapter7.Test3;

/**
 * @author:YiMing
 * @create:2020/7/16,21:02
 * @version:1.0
 */
public class Children extends Father{
    public Children(){
        System.out.println("这里是Children构造器");
    }
    public static void main(String[] args) {
        /*
         *没有创建Childre构造器，编译器会合成一个默认构造器，并调用基类
         * 基类构造器总是被调用
         * 基类构造器在导出类构造器之前被调用
         */
        Children children = new Children();
    }
}
