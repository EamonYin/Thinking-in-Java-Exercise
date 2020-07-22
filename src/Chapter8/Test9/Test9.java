package Chapter8.Test9;

/**
 * @author:YiMing
 * @create:2020/7/22,22:06
 * @version:1.0
 */
public class Test9 {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Gerbil(),
                new Hamster(),
                new Mouse()
        };
        for (Rodent rodent : rodents) {
            rodent.hop();
            rodent.reproduce();
            rodent.scurry();
            System.out.println("--------------------");
        }
    }
}
