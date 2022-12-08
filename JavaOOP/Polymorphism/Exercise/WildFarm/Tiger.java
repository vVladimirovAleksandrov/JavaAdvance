package JavaAdvance.JavaOOP.Polymorphism.Exercise.WildFarm;

public class Tiger extends Felime{
    public Tiger(String animalName, String animalType, Double animalWeight, Integer foodEaten, String livingRegion) {
        super(animalName, animalType, animalWeight, foodEaten, livingRegion);
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void eat(Food food) {

    }
}
