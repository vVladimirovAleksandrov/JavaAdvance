package shelter;

public class Animal {
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private String caretaker;
    public String getCaretaker() {
        return caretaker;
    }
    public void setCaretaker(String caretaker) {
        this.caretaker = caretaker;
    }

    public Animal(String name, int age, String caretaker) {
        this.name = name;
        this.age = age;
        this.caretaker = caretaker;
    }

    @Override
    public String toString() {
        return String.format("%s %d (%s)", getName(), getAge(), getCaretaker());
    }
}
