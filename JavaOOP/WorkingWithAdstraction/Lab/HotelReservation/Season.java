package JavaOOP.WorkingWithAdstraction.Lab.HotelReservation;

public enum Season {
    SUMMER(4),
    AUTUMN(1),
    WINTER(3),
    SPRING(2);

    private int multiplyCoefficient;

    Season(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }


    public int getMultiplyCoefficient() {
        return multiplyCoefficient;
    }

    public void setMultiplyCoefficient(int multiplyCoefficient) {
        this.multiplyCoefficient = multiplyCoefficient;
    }
}
