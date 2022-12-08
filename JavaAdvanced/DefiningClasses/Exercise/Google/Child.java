package JavaAdvance.JavaAdvanced.DefiningClasses.Exercise.Google;

public class Child {
    private final String name;
    private final String birthday;

    public Child(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.birthday);
    }
}