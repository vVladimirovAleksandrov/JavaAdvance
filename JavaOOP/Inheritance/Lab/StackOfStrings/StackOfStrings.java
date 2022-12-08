package JavaAdvance.JavaOOP.Inheritance.Lab.StackOfStrings;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class StackOfStrings {
    private List<String> container;

    public StackOfStrings() {
        this.container = new ArrayList<>();
    }

    public void push(String item) { this.container.add(item); }

    public String pop() {
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return this.container.remove(this.container.size() - 1);
    }

    public String peek() {
        return this.container.get(this.container.size() - 1);
    }

    public boolean isEmpty() {
        return container.isEmpty();
    }
}
