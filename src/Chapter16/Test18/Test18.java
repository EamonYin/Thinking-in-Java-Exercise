package Chapter16.Test18;

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
public class Test18 {
    public static void main(String[] args) {
        Pet[] p=new Pet[]{new Cat(),new Dog(),new Pug()};
        System.out.println("p: "+Arrays.toString(p));
        Pet[] m=new Pet[]{new Pet(),new Pet(),new Pet(),new Pet(),new Pet(),new Pet()};
        System.out.println("Old m: "+Arrays.toString(m));
        System.arraycopy(p,0,m,0,p.length);
        System.out.println("New m: "+Arrays.toString(m));
    }
}
