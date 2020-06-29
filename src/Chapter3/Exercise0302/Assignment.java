package Chapter3.Exercise0302;

/**
 * 别名现象
 * @author:YiMing
 * @create:2020/6/29,12:32
 * @version:1.0
 */
public class Assignment {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();

        t1.level = 9;
        t2.level = 47;

        System.out.println("1: t1.level="+t1.level+" t2.level="+t2.level);

        t1 = t2;//因为复制的是相同的对象的引用，指向相同的对象，t1的复制被覆盖了

        System.out.println("2: t1.level="+t1.level+" t2.level="+t2.level);

        t1.level = 27;

        System.out.println("3: t1.level="+t1.level+" t2.level="+t2.level);

    }
}
