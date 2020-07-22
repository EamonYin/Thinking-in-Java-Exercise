package Chapter7.Test18;

/**
 * @author:YiMing
 * @create:2020/7/20,18:35
 * @version:1.0
 */
public class WithFinalFields {
    final SelfCounter selfCounter = new SelfCounter();
    static final SelfCounter s = new SelfCounter();
    public String toString(){
        return "selfcounter = "+selfCounter+" \ns = "+s;
    }

}
