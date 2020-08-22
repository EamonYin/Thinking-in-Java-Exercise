package Chapter15.Test5;

/**
 * @author:YiMing
 * @create:2020/8/22,19:55
 * @version:1.0
 */
public class LinkedExercise<T> {
    private class Node {
        T pre;
        Node next;

        public Node() {
            pre = null;
            next = null;
        }

        public Node(T pre, Node next) {
            this.pre = pre;
            this.next = next;
        }

        boolean end() {
            return pre == null && next == null;
        }
    }

    private Node top = new Node();

    public void push(T pre) {
        top = new Node(pre, top);
    }

    public T pop() {
        T result = top.pre;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LinkedExercise<String> stringLinked = new LinkedExercise<>();
        for (String s : "This is XiaoMing !".split(" "))
            stringLinked.push(s);
        String s;
        while ((s = stringLinked.pop()) != null) {
            System.out.println(s);
        }
    }
}
