package JavaAdvanced.DefiningClasses.Exercise.RawData;

public class Engine {
    private int speed;
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int power;
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }
}
