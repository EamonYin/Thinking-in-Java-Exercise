package Chapter15.Test32;//: generics/GenericCast.java

class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;

    public FixedSizeStack(int size) {
        storage = new Object[size];
    }

    public void push(T item) {
        storage[index++] = item;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        return (T) storage[--index];
    }
}

public class GenericCast {
    public static void main(String[] args) {
        FixedSizeStack<Integer> stack = new FixedSizeStack<>(1);
        stack.push(1);
        System.out.println(stack.pop());
        stack.push(2);
        System.out.println(stack.pop());
    }
}
