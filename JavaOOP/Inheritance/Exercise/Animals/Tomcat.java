package JavaAdvance.JavaOOP.Inheritance.Exercise.Animals;

public class Tomcat extends Cat{
    public Tomcat(String animalName, int age) {
        super(animalName, age, "Male");
    }

    public String produceSound() {
        return "MEOW";
    }
}
