package Chapter8.Test16;

/**
 * @author:YiMing
 * @create:2020/7/24,18:52
 * @version:1.0
 */
public class Starship {
    private AlertStatus alertStatus= new GreenAlertStatus();
    public void setStatus(AlertStatus isatus){
        alertStatus = isatus;

    }
    public String toString(){
        return alertStatus.getStatus();
    }
}
