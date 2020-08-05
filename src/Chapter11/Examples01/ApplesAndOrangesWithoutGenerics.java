package Chapter11.Examples01;

import java.util.ArrayList;

/**
 * @author:YiMing
 * @create:2020/8/3,18:30
 * @version:1.0
 */
public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for(int i = 0 ; i < 3 ; i++){
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for(int i = 0 ; i < apples.size() ; i++){
            ((Apple)apples.get(i)).id();
        }
    }
}
