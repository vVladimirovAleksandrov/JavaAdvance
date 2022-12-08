package JavaAdvance.JavaAdvanced.Workshop.CustomStack;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;
    private int[] items;
    private int size;
    private int capacity;

    public CustomStack() {
        this.capacity = INITIAL_CAPACITY;
        this.items = new int[INITIAL_CAPACITY];
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

    public void peek() {
        checkEmpty();

        int element = this.items[this.size - 1];
        System.out.println(element);
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }

    private void checkEmpty() {
        if(this.size == 0){
            String massage = String.format("CustomStack is empty");
            throw new NoSuchElementException(massage);
        }
    }

    private void resize() {
        this.capacity *= 2;
        int[] copy = new int[this.capacity];

        for (int i = 0; i < this.items.length; i++) {
            copy[i] = this.items[i];
        }
        this.items = copy;
    }
}
