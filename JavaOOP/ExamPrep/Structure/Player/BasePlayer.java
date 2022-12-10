package JavaAdvance.JavaOOP.ExamPrep.Structure.Player;

public abstract class BasePlayer {
    private String name;
    private String nationality;
    private double kg;
    private int strength;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()){
            throw new NullPointerException("Player name cannot be null or empty");
        }
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if(nationality.isBlank()){
            throw new NullPointerException("Player nationality cannot be null or empty");
        }
        this.nationality = nationality;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        if(strength <= 0){
            throw new IllegalArgumentException("Players strength cannot be below or equal to 0.");
        }
        this.strength = strength;
    }

    protected BasePlayer(String name, String nationality, double kg, int strength) {
        setName(name);
        setNationality(nationality);
        setKg(kg);
        setStrength(strength);
    }

    public abstract void stimulation();
}
