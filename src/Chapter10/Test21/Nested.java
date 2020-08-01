package Chapter10.Test21;

/**
 * @author:YiMing
 * @create:2020/8/1,17:39
 * @version:1.0
 */
public interface Nested {
    public void f();
    class InterNested implements Nested{

        static void InterMethod(Nested nestedImpl){
            System.out.println("Nested.f()");
            nestedImpl.f();
        }

        @Override
        public void f() {
            System.out.println("Nested.f()");
        }

        public String toString(){
            return "This is InterNested";
        }

        public static void main(String[] args) {
            new InterNested().toString();
        }
    }
}
