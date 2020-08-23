package Chapter15.Test19;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/8/23,20:13
 * @version:1.0
 */
//货舱
public class CargoHold extends ArrayList<Container> {
    public CargoHold(int nContainers, int nProducts){
        for(int i = 0; i < nContainers; i++)
            add(new Container(nProducts));
    }
}
