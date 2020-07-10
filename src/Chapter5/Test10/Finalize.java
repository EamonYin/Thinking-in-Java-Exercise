package Chapter5.Test10;

/**
 * @author:YiMing
 * @create:2020/7/6,18:12
 * @version:1.0
 * 【Test10】
 */
public class Finalize {
    boolean flag = false;
    void flageTrue(){
        flag = true;
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        if(!flag){
            System.err.println("flag is not true");
        }
    }
}
