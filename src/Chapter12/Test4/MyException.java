package Chapter12.Test4;

/**
 * @author:YiMing
 * @create:2020/8/9,19:59
 * @version:1.0
 */
public class MyException extends Exception {
    private String problem;

    public MyException() {
    }

    public MyException(String s) {
        this.problem = s;
    }

    public void getProblem() {
        System.out.println("【MyException显示当前异常】：" + problem);
    }
}
