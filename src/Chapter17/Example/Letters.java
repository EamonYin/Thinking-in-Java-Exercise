package Chapter17.Example;

import java.util.*;

import net.mindview.util.*;

import static net.mindview.util.Print.*;

/**
 * @author:YiMing
 * @create:2020/9/1,18:27
 * @version:1.0
 */


class Letters implements Generator<Pair<Integer, String>>,
        Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(
                number++, "" + letter++);
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public Integer next() {
                return number++;
            }

            public boolean hasNext() {
                return number < size;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}


