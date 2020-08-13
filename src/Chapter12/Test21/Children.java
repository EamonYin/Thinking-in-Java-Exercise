package Chapter12.Test21;

/**
 * @author:YiMing
 * @create:2020/8/13,20:05
 * @version:1.0
 */
public class Children extends Father {

    //产生编译错误：对super的调用必须为
    //构造函数中的第一条语句：
    /*public Children(){
        try{
            super();
        }catch (FatherException fe){

        }
    }*/

    public Children() throws FatherException {
    }
}
