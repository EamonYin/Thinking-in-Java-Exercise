package Chapter8.Test14;

/**
 * @author:YiMing
 * @create:2020/7/23,22:04
 * @version:1.0
 */
public class Test14 {
    public static void main(String[] args) {
        SharedMember sharedMember = new SharedMember();
        Rodent[] rodents = {
                new Gerbil(sharedMember),
                new Hamster(sharedMember),
                new Mouse(sharedMember)
        };
        for (Rodent rodent:
             rodents) {
            rodent.dispose();
        }
    }

}
