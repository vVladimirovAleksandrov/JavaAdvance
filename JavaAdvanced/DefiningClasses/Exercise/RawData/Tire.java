package JavaAdvanced.DefiningClasses.Exercise.RawData;


public class Tire {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    private double pressure;
    public double getPressure() {
        return pressure;
    }
    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }
    
}
