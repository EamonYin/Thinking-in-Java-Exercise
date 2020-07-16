package Chapter7.Test2;

/**
 * @author:YiMing
 * @create:2020/7/16,17:16
 * @version:1.0
 */
public class Disinfectant extends Detergent{
    public void sterilize(int i , String a){
        System.out.println("<"+i+"号"+a+">");
    }
    public void scrub(){
        sterilize(1,"sterilize方法");
        super.scrub(); //super(Cleanser)
    }

    public static void main(String[] args) {
        Disinfectant disinfectant = new Disinfectant();
        disinfectant.scrub();
        System.out.println(disinfectant);
        System.out.println("Testing Detergent main class...");
        Detergent.main(args);
    }
}
