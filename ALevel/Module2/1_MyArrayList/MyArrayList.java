import java.util.Iterator;


public class MyArrayList<E> implements Iterable<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int theSize;
    private E[] theItems;

    public MyArrayList() {
        clear();
    }

    public void clear() {
        theSize = 0;
        ensureCapacity(DEFAULT_CAPACITY);
    }

    public void ensureCapacity(int newCapacity) {
        if (newCapacity < theSize) return;

        E[] old = theItems;
        theItems = (E[]) new Object[newCapacity];
        for (int i = 0; i < size(); i++) {
            theItems[i] = old[i];
        }
    }

    public int size() {
        return theSize;
    }


    public E get(int index) {
        if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();

        return theItems[index];
    }


    public boolean add(E element) {
        add(size(), element);
        return true;
    }



    public void add(int index, E element) {
        if (theItems.length == size()) ensureCapacity(size() * 2 + 1);
        for (int i = theSize; i > index; i--) {
            theItems[i] = theItems[i - 1];
        }
        theItems[index] = element;
        theSize++;
    }

    public E remove(int index) {
        E removeItem = theItems[index];
        for (int i = index; i < size() - 1; i++) {
            theItems[i] = theItems[i + 1];
        }
        theSize--;
        return removeItem;
    }


    public Iterator<E> iterator() {
        return new ArrayListIterator();
    }

    //    iterator
    
    private class ArrayListIterator implements java.util.Iterator<E> {

        private int current = 0;

        public boolean hasNext() {
            return current < size();
        }

        public E next() {
            if (!hasNext()) throw new java.util.NoSuchElementException();
            return theItems[current++];
        }

        public void remove() {
            MyArrayList.this.remove(--current); // reference the outer class
        }
    }
}