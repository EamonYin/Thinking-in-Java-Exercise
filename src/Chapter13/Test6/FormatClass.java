package Chapter13.Test6;

/**
 * @author:YiMing
 * @create:2020/8/15,19:19
 * @version:1.0
 */
public class FormatClass {
    int num;
    long longnum;
    float floatnum;
    double doublenum;

    public FormatClass(int num, long longnum, float floatnum, double doublenum) {
        this.num = num;
        this.longnum = longnum;
        this.floatnum = floatnum;
        this.doublenum = doublenum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("intNum : %d\n",num));
        sb.append(String.format("longNum : %d\n",longnum));
        sb.append(String.format("floatNum : %f\n",floatnum));
        sb.append(String.format("doubleNum : %e\n",doublenum));
        return sb.toString();
    }
}
