package Chapter9.Test19;

/**
 * @author:YiMing
 * @create:2020/7/28,21:25
 * @version:1.0
 */
public class diceFactory implements tossingFactory{
    public tossing getTossing(){
        return new dice();
    }
}
