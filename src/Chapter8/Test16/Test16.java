package Chapter8.Test16;

/**
 * @author:YiMing
 * @create:2020/7/24,18:59
 * @version:1.0
 */
public class Test16 {
    public static void main(String[] args) {
        Starship eprise = new Starship();
        System.out.println(eprise);
        eprise.setStatus(new YellowAlertStatus());
        System.out.println(eprise);
        eprise.setStatus(new RedAlertStatus());
        System.out.println(eprise);
    }
}
