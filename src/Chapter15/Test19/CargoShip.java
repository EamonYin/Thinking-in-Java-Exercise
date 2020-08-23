package Chapter15.Test19;

import Chapter15.Test18.Generators;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/8/23,20:11
 * @version:1.0
 */
//货船
public class CargoShip extends ArrayList<CargoHold> {
    private ArrayList<Crane> cranes = new ArrayList<Crane>();
    private CommandSection cmdSection = new CommandSection();

    public CargoShip(int nCargoHolds, int nContainers, int nProducts) {//货舱，集装箱，物品
        for (int i = 0; i < nCargoHolds; i++)
            add(new CargoHold(nContainers, nProducts));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (CargoHold cargoHold : this) {
            for (Container container : cargoHold) {
                for (Product product : container) {
                    stringBuilder.append(product);
                    stringBuilder.append("\n");
                }
            }
        }
        return stringBuilder.toString();
    }
}
