package Chapter16.Test1;

/**
 * @author:YiMing
 * @create:2020/8/29,20:38
 * @version:1.0
 */
class BerylliumSphere {
    private static long couter;
    private final long id = couter;

    public String toString() {
        return "Sphere " + id;
    }
}

class Test1 {
    static void hide(BerylliumSphere[] s) {
        System.out.println("Hiding " + s.length + " sphere(s)");
    }

    public static void main(String[] args) {
        hide(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()});
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        hide(d);
        BerylliumSphere[] a = new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere()};
        hide(a);
    }
}
