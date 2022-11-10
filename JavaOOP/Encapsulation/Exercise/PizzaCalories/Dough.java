package JavaOOP.Encapsulation.Exercise.PizzaCalories;

import java.util.Arrays;

public class Dough {
    private String flourType;
    private BakingTechnique bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType) {
            case "White", "Wholegrain" -> this.flourType = flourType;
            default -> throw new IllegalArgumentException("Invalid type of dough.");
        }

    }

    private void setBakingTechnique(String bakingTechnique) {
        boolean bakingTechniqueDoesNotExist =
                Arrays.stream(BakingTechnique.values()).noneMatch(e -> e.name().equals(bakingTechnique));
        if(bakingTechniqueDoesNotExist) {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = BakingTechnique.valueOf(bakingTechnique);
    }

    private void setWeight(double weight) {
        if(weight < 1 || weight > 200) {
            throw new IllegalArgumentException("Dough wight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * this.weight * bakingTechnique.getModifier() * getFlourTypeModifier();
    }

    private double getFlourTypeModifier() {
        return switch (this.flourType) {
            case "White" -> 1.5;
            case "Wholegrain" -> 1.0;
            default -> 0;
        };
    }
}