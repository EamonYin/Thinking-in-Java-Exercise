package Chapter15.Test33;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/8/27,16:37
 * @version:1.0
 */
public class FixedSizeStack2<T> {
    private int index;
    private final int size;
    private final List<T> storage;

    public FixedSizeStack2(int size) {
        storage = new ArrayList<T>(size);
        this.size = size;
    }

    public void push(T item) {
        if (index < size) {
            index++;
            storage.add(item);
        } else
            throw new FullStackException();
    }

    public T pop() {
        if (index > 0)
            return storage.get(--index);
        throw new EmptyStackException();
    }
}
