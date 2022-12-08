package JavaAdvance.JavaOOP.Inheritance.Exercise.Animals;

public class Dog extends Animal{
    public Dog(String animalName, int age, String gender) {
        super(animalName, age, gender);
    }

    public String produceSound() {
        return "Woof!";
    }
}
