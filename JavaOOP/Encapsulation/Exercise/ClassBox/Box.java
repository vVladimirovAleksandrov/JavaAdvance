package JavaOOP.Encapsulation.Exercise.ClassBox;

public class Box {
    private double lenght;
    private double width;
    private double height;

    public double getLenght() {
        return lenght;
    }
    private void setLenght(double lenght) {
        if(lenght <= 0) {
            throw new IllegalArgumentException("Lenght cannot be zero or negative.");
        }
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }
    private void setWidth(double width) {
        if(width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    private void setHeight(double height) {
        if(height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public Box(double lenght, double width, double height) {
        setLenght(lenght);
        setWidth(width);
        setHeight(height);
    }

    public double calculateSurfaceArea() {
        return (2 * getLenght() * getWidth()) +
                (2 * getLenght() * getHeight()) +
                (2 * getWidth() * getHeight());
    }

    public double calculateLateralSurfaceArea() {
        return (2 * getLenght() * getHeight()) +
                (2 * getWidth() * getHeight());
    }

    public double calculateVolume() {
        return getLenght() * getWidth() * getHeight();
    }
}
