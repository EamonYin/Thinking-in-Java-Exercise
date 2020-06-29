package Chapter3.Exercise0305and06;

/**
 * 关系操作符
 * @author:YiMing
 * @create:2020/6/29,17:59
 * @version:1.0
 */
public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        //练习5
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "Ruff!";

        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.println("dog1:"+dog1.name+" "+dog1.says);
        System.out.println("dog2:"+dog2.name+" "+dog2.says);

        //练习6
        Dog dog3 = new Dog();
        dog3 = dog1;
        System.out.println("dog3 == dog1:"+ (dog3 == dog1));
        System.out.println("dog3.equals(dog1)"+(dog3.equals(dog1)));
    }

}
