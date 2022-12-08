package JavaAdvance.JavaOOP.Inheritance.Exercise.Animals;

public class Kitten extends Cat{
    public Kitten(String animalName, int age) {
        super(animalName, age, "Female");
    }

    public String produceSound() {
        return "Meow";
    }
}
