package JavaAdvanced.DefiningClasses.Exercise.OpinionPoll;

public class Persson {
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

    public Persson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printPersson() {
        System.out.println(String.format("%s - %d", this.name, this.age));
    }
}
