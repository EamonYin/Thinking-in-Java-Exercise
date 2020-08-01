package Chapter10.Test18;

/**
 * @author:YiMing
 * @create:2020/8/1,12:02
 * @version:1.0
 */
public class Nested {
    static class NestedClass{

        public void getNested(){
            System.out.println("This is Nested Class getNested（）");
        }

        public String toString(){
            return "This is Nested Class";
        }

    }

    public static void main(String[] args) {
        NestedClass nestedClass = new NestedClass();
        System.out.println(nestedClass);
    }
}
