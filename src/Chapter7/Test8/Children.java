package Chapter7.Test8;

import Chapter7.Test7.C;

/**
 * @author:YiMing
 * @create:2020/7/16,21:44
 * @version:1.0
 */
public class Children extends Father{
    public Children() {
        super();
        System.out.println("这里是public Children()");
    }
    public Children(int i) {
        super();
        System.out.println("这里是Children(int i)");
    }

    public static void main(String[] args) {
        Children children = new Children(1);
    }

}
