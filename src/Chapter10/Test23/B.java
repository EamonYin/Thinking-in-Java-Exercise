package Chapter10.Test23;

/**
 * @author:YiMing
 * @create:2020/8/1,20:16
 * @version:1.0
 */
public class B {
    public U[] ArryU;

    public B(int size) {
        ArryU = new U[size];
    }

    public boolean add(U elem) {
        for (int i = 0; i < ArryU.length; i++) {
            if (ArryU[i] == null) {
                ArryU[i] = elem;
                return true;
            }
        }
        return false;
    }

    public boolean setNull(int i) {
        if (i < 0 || i > ArryU.length) {
            return false;
        } else {
            ArryU[i] = null;
            return true;
        }
    }

    public void callMethod() {
        for (int i = 0; i < ArryU.length; i++) {
            if (ArryU[i] != null) {
                ArryU[i].MethodUa();
                ArryU[i].MethodUb();
                ArryU[i].MethodUc();
            }
        }
    }

}
