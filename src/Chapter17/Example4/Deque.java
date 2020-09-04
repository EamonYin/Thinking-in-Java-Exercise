package Chapter17.Example4;

import java.util.LinkedList;

/**
 * @author:YiMing
 * @create:2020/9/3,15:30
 * @version:1.0
 */
public class Deque<T> {
    private LinkedList<T> deque = new LinkedList();

    public Deque() {
    }

    public void addFirst(T e) {
        this.deque.addFirst(e);
    }

    public void addLast(T e) {
        this.deque.addLast(e);
    }

    public T getFirst() {
        return this.deque.getFirst();
    }

    public T getLast() {
        return this.deque.getLast();
    }

    public T removeFirst() {
        return this.deque.removeFirst();
    }

    public T removeLast() {
        return this.deque.removeLast();
    }

    public int size() {
        return this.deque.size();
    }

    public String toString() {
        return this.deque.toString();
    }
}

