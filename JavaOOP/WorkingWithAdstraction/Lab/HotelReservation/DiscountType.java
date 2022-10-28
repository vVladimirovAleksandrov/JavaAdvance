package JavaOOP.WorkingWithAdstraction.Lab.HotelReservation;

public enum DiscountType {
    NONE(0),
    SECONDVISIT(10),
    VIP(20);

    private double percent;

    DiscountType(double percent) {
        this.percent = percent;
    }


    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
