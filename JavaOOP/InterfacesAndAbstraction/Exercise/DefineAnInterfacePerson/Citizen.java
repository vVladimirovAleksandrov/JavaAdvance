package JavaAdvance.JavaOOP.InterfacesAndAbstraction.Exercise.DefineAnInterfacePerson;

public class Citizen implements Person{
    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
