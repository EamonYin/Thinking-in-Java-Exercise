package Chapter16.Test4;

/**
 * @author:YiMing
 * @create:2020/8/30,16:44
 * @version:1.0
 */
public class A {
    public Double[][][] MadeDoubleArray(int xLen, int yLen, int zLen, double valStart, double valEnd) {
        Double[][][] doubles = new Double[xLen][yLen][zLen];
        double increment = (valEnd - valStart) / (xLen * yLen * zLen);
        double val = valStart;
        for (int i = 0; i < doubles.length; i++)
            for (int j = 0; j < doubles[i].length; j++) {
                for (int z = 0 ; z<doubles[i][j].length;z++)
                doubles[i][j][z] = val;
                val += increment;
            }
        return doubles;
    }
}
