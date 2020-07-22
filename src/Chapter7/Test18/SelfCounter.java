package Chapter7.Test18;

/**
 * @author:YiMing
 * @create:2020/7/20,18:35
 * @version:1.0
 */
public class SelfCounter {
    private static int count;
    private int id = count++;
    public String toString(){
        return "Selfcounter"+id;
    }
}
