package Chapter8.Test16.Transmorgrify;

/**
 * @author:YiMing
 * @create:2020/7/24,18:49
 * @version:1.0
 */
public class Stage {
    private Actor actor = new HappyActor();
    public void change(){
        actor = new SadActor();
    }
    public void performPlay(){
        actor.act();
    }
}
