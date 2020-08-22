package Chapter15.Test4;//: innerclasses/Sequence.java
// Holds a sequence of Objects.

interface Selector<T> {
    boolean end();

    T current();

    void next();
}

public class Sequence<T> {
    private T[] items;
    private int next = 0;

    public Sequence(T[] size) {
        items = size;
    }

    public void add(T x) {
        if (next < items.length)
            items[next++] = x;
    }

    private class SequenceSelector implements Selector<T> {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public T current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence<String> stringSequence = new Sequence<>(new String[10]);
        //Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++)
            stringSequence.add(Integer.toString(i));
        Selector selector = stringSequence.selector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
