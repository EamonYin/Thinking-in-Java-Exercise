package Chapter9.Test1;

/**
 * @author:YiMing
 * @create:2020/7/25,18:19
 * @version:1.0
 */
public class Test1 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Gerbil(),
                new Hamster(),
                new Mouse()
        };
        for (Rodent rodent: rodents) {
            rodent.hop();
            rodent.reproduce();
            rodent.scurry();
        }
    }
}
