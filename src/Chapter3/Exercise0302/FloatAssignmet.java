package Chapter3.Exercise0302;

/**
 * 别名现象
 * @author:YiMing
 * @create:2020/6/29,14:57
 * @version:1.0
 */
public class FloatAssignmet {
    public static void main(String[] args) {
        FloatTank f1 = new FloatTank();
        FloatTank f2 = new FloatTank();

        f1.level = 3.3f;
        f2.level = 5.6f;

        System.out.println("1. f1.level ="+f1.level+" f2.level="+f2.level);

        f1 = f2;

        System.out.println("2. f1.level ="+f1.level+" f2.level="+f2.level);
    }
}
