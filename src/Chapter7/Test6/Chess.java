package Chapter7.Test6;

/**
 * @author:YiMing
 * @create:2020/7/16,21:33
 * @version:1.0
 */
public class Chess extends BoardGame{
    Chess() {
        super(11);
        System.out.println("Chess controller");
    }

    public static void main(String[] args) {
        Chess chess = new Chess();
    }
}
