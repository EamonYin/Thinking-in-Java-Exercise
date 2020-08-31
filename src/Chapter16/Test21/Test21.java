package Chapter16.Test21;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Pet;
import typeinfo.pets.Pug;

import java.util.Arrays;

/**
 * @author:YiMing
 * @create:2020/8/31,17:58
 * @version:1.0
 */
public class Test21 {
    public static void main(String[] args) {
        Integer a =1;
        Integer b =2;

        CompareWith compareWith = new CompareWith();
        int compare = compareWith.compare(a, b);// 自定义 a<b 返回 1
        System.out.println(compare);

        System.out.println(a.compareTo(b));//a<b 返回-1

    }
}
