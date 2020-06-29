package Chapter3.Exercise09;

/**
 * 分别显示用float和double指数计数法所能表示的最大和最小值
 * @author:YiMing
 * @create:2020/6/29,20:01
 * @version:1.0
 */
public class ExerciseNine {
    public static void main(String[] args) {
        float f = Float.MAX_VALUE;
        float fmin = Float.MIN_VALUE;
        System.out.println("最大的float值"+f+" 最小的float值"+fmin);
        double d = Double.MAX_VALUE;
        double dmin = Double.MIN_VALUE;
        System.out.println("最大的double值"+d+" 最小的fdouble值"+dmin);

    }
}
