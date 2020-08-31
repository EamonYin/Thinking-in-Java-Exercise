package Chapter16.Test3;

/**
 * @author:YiMing
 * @create:2020/8/30,16:44
 * @version:1.0
 */
public class A {
    public Double[][] MadeDoubleArray(int xLen, int yLen, double valStart, double valEnd) {
        Double[][] doubles = new Double[xLen][yLen];
        double increment = (valEnd - valStart) / (xLen * yLen);
        double val = valStart;
        for (int i = 0; i < doubles.length; i++)
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j] = val;
                val += increment;
            }
        return doubles;
    }
}
