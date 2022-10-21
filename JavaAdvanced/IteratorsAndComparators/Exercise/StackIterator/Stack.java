package JavaAdvanced.IteratorsAndComparators.Exercise.StackIterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack implements Iterable<Integer> {
    private static final int INITIAL_CAPACITY = 4;
    private Integer[] items;
    private int size;
    private int capacity;

    public Stack(Integer... elements) {
        this.capacity = elements.length;
        this.items = elements;
    }

    public int getSize() {
        return size;
    }

    public void push(int element) {
        if(this.size == this.capacity) resize();

        this.items[this.size++] = element;
    }

    public int pop() {
        checkEmpty();

        int element = this.items[this.size - 1];
        this.size--;
        return element;
    }

    public void printAll() {
        for (Integer item : items) {
            System.out.println(item);
        }
    }

    private void checkEmpty() {
        if(this.size == 0){
            String massage = String.format("No elements");
            throw new NoSuchElementException(massage);
        }
    }

    private void resize() {
        this.capacity *= 2;
        Integer[] copy = new Integer[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            copy[i] = this.items[i];
        }
        this.items = copy;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int index;

            @Override
            public boolean hasNext() {
                return index < getSize();
            }

            @Override
            public Integer next() {
                Integer element = pop();
                index++;
                return element;
            }
        };
    }
}
