package Chapter9.Test11;

/**
 * @author:YiMing
 * @create:2020/7/26,21:18
 * @version:1.0
 */
public class Apply {
    public static void process(Processor p , Object s){
        System.out.println("Using Processor"+p.name());
        System.out.println(p.process(s));
    }
}
