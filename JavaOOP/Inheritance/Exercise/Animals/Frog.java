package JavaAdvance.JavaOOP.Inheritance.Exercise.Animals;

public class Frog extends Animal{
    public Frog(String animalName, int age, String gender) {
        super(animalName, age, gender);
    }

    public String produceSound() {
        return "Ribbit";
    }
}
