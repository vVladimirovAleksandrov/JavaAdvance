package JavaAdvance.JavaOOP.Inheritance.Exercise.Animals;

public class Cat extends Animal{
    public Cat(String animalName, int age, String gender) {
        super(animalName, age, gender);
    }

    public String produceSound() {
        return "Meow meow";
    }
}
