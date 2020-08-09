package Chapter11.Test30;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Collection;
import java.util.Iterator;

/**
 * @author:YiMing
 * @create:2020/8/8,19:08
 * @version:1.0
 */
public class Test30 implements Collection<Pet> {
    private Pet[] pets = Pets.createArray(8);

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    public boolean add(Pet p) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        if (this.size() != 0)
            for (Pet p : pets)
                p = null;
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0) ? true : false;
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }


    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        return pets;
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        Test30 c = new Test30();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}
