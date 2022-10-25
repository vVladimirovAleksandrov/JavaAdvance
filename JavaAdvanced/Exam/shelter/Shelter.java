package shelter;

import java.net.http.HttpResponse.ResponseInfo;
import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Animal animal) {
        if(data.size() < capacity){
        data.add(animal);
        }
    }

    public boolean remove(String name){
        return data.removeIf(a -> a.getName().equals(name));
    }

    public Animal getAnimal(String name, String caretaker) {
        Animal result = null;
        for (Animal animal : data) {
            if(animal.getName() == name && animal.getCaretaker() == caretaker) {
                result = animal;
                return result;
            }
        }
        return null;
    }

    public Animal getOldestAnimal() {
        Animal result = null;
        int max = 0;
        for (Animal animal : data) {
            if(animal.getAge() > max){
                max = animal.getAge();
                result = animal;
            }
        }
        return result;
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {
        String result = "The shelter has the following animals:";
        for (Animal animal : data) {
            result += String.format("\n%s %s", animal.getName(), animal.getCaretaker());
        }
        return result;
    }
}
