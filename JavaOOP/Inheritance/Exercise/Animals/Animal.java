package JavaAdvance.JavaOOP.Inheritance.Exercise.Animals;

public class Animal {
    private String animalName;
    private int age;
    private String gender;

    public Animal(String animalName, int age, String gender) {
        this.setAnimalName(animalName);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        if(animalName.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.animalName = animalName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid input");
        }
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sd = new StringBuilder();
        sd.append(getClass().getSimpleName()).append(System.lineSeparator());
        sd.append(String.format("%s %d %s\n", this.animalName, this.age, this.gender));
        sd.append(produceSound());

        return sd.toString();
    }

    private String produceSound() {
        return "";
    }
}
