package Chapter11.Test17;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/8/6,18:56
 * @version:1.0
 */
public class Test17 {
    public static void main(String[] args) {
        TreeSet<String> gerbilName = new TreeSet<>();
        String[] name = {"Fuzzy","Spot","Bob"};
        Collections.addAll(gerbilName,name);

        HashMap<String, Gerbil> sgh = new HashMap<>();
        sgh.put("Fuzzy",new Gerbil(1));
        sgh.put("Spot",new Gerbil(2));
        sgh.put("Bob",new Gerbil(3));

        Set<String> sName = sgh.keySet();
        Iterator<String> iterator = sName.iterator();

        while (iterator.hasNext()){
            String gName = iterator.next();
            System.out.println(gName + ":" + sgh.get(gName) + ": " + sgh.get(gName).hop());
        }

    }
}
