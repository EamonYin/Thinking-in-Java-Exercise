package Chapter5;

/**
 * @author:YiMing
 * @create:2020/7/10,19:30
 * @version:1.0
 * 可变参数列表 。。。（三个点）
 */
public class Test19 {
    public void CanChange(String... strs){
        for (String str : strs) {
            System.out.print(str+" ");
        }
    }

    public static void main(String[] args) {
        Test19 test19 = new Test19();
        test19.CanChange("1","2","3");
        System.out.println();
        test19.CanChange(new String("new"),"12");
        System.out.println();
        test19.CanChange(new String[]{"a","b","c"});
    }
}
